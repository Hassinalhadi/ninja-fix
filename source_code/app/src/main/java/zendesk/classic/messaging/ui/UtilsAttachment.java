package zendesk.classic.messaging.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.format.Formatter;
import android.view.View;
import com.zendesk.logger.Logger;
import com.zendesk.util.FileUtils;
import com.zendesk.util.MimeUtils;
import i7.C1901g;
import okhttp3.internal.ws.RealWebSocket;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
class UtilsAttachment {
    private static final String LOG_TAG = "AttachmentUtils";
    static final String MESSAGING_BASE_PATH = "zendesk/messaging";

    private UtilsAttachment() {
    }

    public static String formatFileSize(Context context, long j5) {
        if (Build.VERSION.SDK_INT >= 26) {
            j5 = ((j5 * 1000000) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        return Formatter.formatFileSize(context, j5);
    }

    private static String getMimeTypeForFile(String str) {
        return MimeUtils.guessMimeTypeFromExtension(FileUtils.getFileExtension(str));
    }

    public static void openAttachment(View view, String str) {
        Context context = view.getContext();
        Uri parse = Uri.parse(str);
        String mimeTypeForFile = getMimeTypeForFile(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(parse, mimeTypeForFile);
        if (mimeTypeForFile != null && mimeTypeForFile.startsWith("image")) {
            context.startActivity(intent);
            return;
        }
        intent.setData(parse);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Logger.e(LOG_TAG, "Unable to open attachment. No app found that can receive the implicit intent", new Object[0]);
        int i4 = R.string.zui_unable_open_file;
        int[] iArr = C1901g.beige;
        C1901g.hotel(view, view.getResources().getText(i4), -1).juliet();
    }
}
