package zendesk.classic.messaging;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Date;

/* loaded from: classes.dex */
class TimestampFactory {
    private static final int FLAGS = 131093;
    private final Context context;

    public TimestampFactory(Context context) {
        this.context = context;
    }

    public String createTimestamp(Date date) {
        return DateUtils.formatDateTime(this.context, date.getTime(), FLAGS);
    }
}
