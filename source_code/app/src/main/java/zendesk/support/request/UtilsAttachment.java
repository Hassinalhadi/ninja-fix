package zendesk.support.request;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import zendesk.support.IdUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class UtilsAttachment {
    private static final String ATTACHMENT_SEPARATOR = ", ";
    private static final String ATTACHMENT_TEXT_BODY = "[%s]";
    private static final String PATH_PLACEHOLDER = "%s%s%s";
    private static final AttachmentNameComparator REQUEST_ATTACHMENT_COMPARATOR;
    private static final String REQUEST_BELVEDERE_PATH;
    private static final String SUPPORT_BELVEDERE_BASE_PATH;

    /* loaded from: classes.dex */
    public static class AttachmentNameComparator implements Comparator<StateRequestAttachment> {
        public /* synthetic */ AttachmentNameComparator(int i4) {
            this();
        }

        private AttachmentNameComparator() {
        }

        @Override // java.util.Comparator
        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getName().compareTo(stateRequestAttachment2.getName());
        }
    }

    static {
        Locale locale = Locale.US;
        String str = File.separator;
        String gray = ad.gray("zendesk", str, "support");
        SUPPORT_BELVEDERE_BASE_PATH = gray;
        REQUEST_BELVEDERE_PATH = ad.amber(gray, str, "request");
        REQUEST_ATTACHMENT_COMPARATOR = new AttachmentNameComparator(0);
    }

    private UtilsAttachment() {
    }

    public static Drawable getAppIcon(Context context, ResolveInfo resolveInfo) {
        Drawable drawable;
        if (resolveInfo != null) {
            drawable = resolveInfo.loadIcon(context.getPackageManager());
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        return context.getDrawable(R.drawable.sym_def_app_icon);
    }

    public static ResolveInfo getAppInfoForFile(Context context, MediaResult mediaResult) {
        PackageManager packageManager = context.getPackageManager();
        if (mediaResult == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(mediaResult.getUri());
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (CollectionUtils.isEmpty(queryIntentActivities)) {
            return null;
        }
        return queryIntentActivities.get(0);
    }

    public static CharSequence getAppName(Context context, ResolveInfo resolveInfo) {
        CharSequence charSequence;
        if (resolveInfo != null) {
            charSequence = resolveInfo.loadLabel(context.getPackageManager());
        } else {
            charSequence = "";
        }
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return context.getString(zendesk.support.R.string.request_attachment_generic_unknown_app);
    }

    public static String getAttachmentSubDir(String str, long j5) {
        Locale locale = Locale.US;
        return str + File.separator + j5;
    }

    public static String getCacheDirForRequestId(String str) {
        Locale locale = Locale.US;
        return ad.amber(REQUEST_BELVEDERE_PATH, File.separator, str);
    }

    public static String getContentDescriptionForAttachmentButton(Context context, int i4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(zendesk.support.R.string.request_menu_button_label_add_attachments));
        sb2.append(". ");
        if (i4 == 0) {
            sb2.append(context.getString(zendesk.support.R.string.zs_request_attachment_indicator_no_attachments_selected_accessibility));
        } else if (i4 == 1) {
            sb2.append(context.getString(zendesk.support.R.string.zs_request_attachment_indicator_one_attachments_selected_accessibility));
        } else {
            sb2.append(context.getString(zendesk.support.R.string.zs_request_attachment_indicator_n_attachments_selected_accessibility, Integer.valueOf(i4)));
        }
        return sb2.toString();
    }

    public static String getMessageBodyForAttachments(List<StateRequestAttachment> list) {
        List copyOf = CollectionUtils.copyOf(list);
        Collections.sort(copyOf, REQUEST_ATTACHMENT_COMPARATOR);
        StringBuilder sb2 = new StringBuilder();
        int size = copyOf.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb2.append(((StateRequestAttachment) copyOf.get(i4)).getName());
            if (i4 < size - 1) {
                sb2.append(ATTACHMENT_SEPARATOR);
            }
        }
        Locale locale = Locale.US;
        return ad.gray(Constants.AES_PREFIX, sb2.toString(), Constants.AES_SUFFIX);
    }

    public static String getTemporaryRequestCacheDir() {
        Locale locale = Locale.US;
        return ad.amber(REQUEST_BELVEDERE_PATH, File.separator, IdUtil.newStringId());
    }

    public static boolean hasAttachmentBody(StateMessage stateMessage) {
        if (CollectionUtils.isNotEmpty(stateMessage.getAttachments())) {
            return stateMessage.getBody().equals(getMessageBodyForAttachments(stateMessage.getAttachments()));
        }
        return false;
    }

    public static boolean isImageAttachment(StateRequestAttachment stateRequestAttachment) {
        String mimeType = stateRequestAttachment.getMimeType();
        if (StringUtils.hasLength(mimeType) && mimeType.toLowerCase(Locale.US).startsWith("image")) {
            return true;
        }
        return false;
    }
}
