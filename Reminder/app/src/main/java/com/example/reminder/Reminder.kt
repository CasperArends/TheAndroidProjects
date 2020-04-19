import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.w3c.dom.Text

@Parcelize
data class Reminder(
    var reminderText: String
) : Parcelable