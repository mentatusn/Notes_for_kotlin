package simple.clever.notes.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class CardData implements Parcelable {

    private String id;
    private String head;
    private Date timeOpen;
    private boolean favorite;

    public CardData(String head, Date timeOpen, boolean favorite) {
        this.head = head;
        this.timeOpen = timeOpen;
        this.favorite = favorite;
    }

    public String getHead() {
        return head;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public boolean isFavorite() {
        return favorite;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(head);
        dest.writeByte((byte) (favorite ? 1 : 0));
        dest.writeLong(timeOpen.getTime());
    }

    protected CardData(Parcel in) {
        head = in.readString();
        favorite = in.readByte() != 0;
        timeOpen = new Date(in.readLong());
    }

    public static final Creator<CardData> CREATOR = new Creator<CardData>() {
        @Override
        public CardData createFromParcel(Parcel in) {
            return new CardData(in);
        }

        @Override
        public CardData[] newArray(int size) {
            return new CardData[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
