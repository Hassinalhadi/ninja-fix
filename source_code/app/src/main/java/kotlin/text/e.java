package kotlin.text;

import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import s6.AbstractC2752q6;

/* loaded from: classes2.dex */
public final class e {
    public static final e alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.text.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        if (!AbstractC2752q6.alpha("  ") && !AbstractC2752q6.alpha("") && !AbstractC2752q6.alpha("")) {
            AbstractC2752q6.alpha("");
        }
        alpha = obj;
    }

    public final void alpha(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append("bytesPerLine = ");
        sb2.append(LottieConstants.IterateForever);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("bytesPerGroup = ");
        sb2.append(LottieConstants.IterateForever);
        sb2.append(Constants.SEPARATOR_COMMA);
        sb2.append('\n');
        sb2.append(str);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        Q0.c.azure(sb2, str, "bytePrefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("byteSuffix = \"");
        sb2.append("");
        sb2.append("\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        alpha(sb2, "    ");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
