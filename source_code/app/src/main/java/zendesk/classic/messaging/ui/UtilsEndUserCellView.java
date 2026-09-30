package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zendesk.logger.Logger;
import java.util.HashSet;
import java.util.Set;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;
import zendesk.classic.messaging.ui.MessagePopUpHelper;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
class UtilsEndUserCellView {
    private static final String LOG_TAG = "UtilsEndUserCellView";
    private static final int ERROR_BACKGROUND = R.drawable.zui_background_cell_errored;
    private static final int FILE_BACKGROUND = R.drawable.zui_background_cell_file;
    private static final int USER_MESSAGE_BACKGROUND = R.drawable.zui_background_end_user_cell;
    private static final int TAP_TO_RETRY = R.string.zui_label_tap_retry;
    private static final int EXCEEDING_MAX_FILE_SIZE = R.string.zui_message_log_message_file_exceeds_max_size;
    private static final int ATTACHMENTS_NOT_SUPPORTED = R.string.zui_message_log_message_attachments_not_supported;
    private static final int ATTACHMENT_TYPE_NOT_SUPPORTED = R.string.zui_message_log_message_attachment_type_not_supported;
    private static final int ATTACHMENT_COULD_NOT_BE_SENT = R.string.zui_message_log_attachment_sending_failed;
    private static final int ERROR_BACKGROUND_COLOR = R.color.zui_error_background_color;
    private static final int PENDING_COLOR = R.color.zui_color_white_60;

    /* renamed from: zendesk.classic.messaging.ui.UtilsEndUserCellView$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$classic$messaging$MessagingItem$FileQuery$FailureReason;
        static final /* synthetic */ int[] $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status;

        static {
            int[] iArr = new int[MessagingItem.Query.Status.values().length];
            $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status = iArr;
            try {
                iArr[MessagingItem.Query.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.FAILED_NO_RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.DELIVERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[MessagingItem.FileQuery.FailureReason.values().length];
            $SwitchMap$zendesk$classic$messaging$MessagingItem$FileQuery$FailureReason = iArr2;
            try {
                iArr2[MessagingItem.FileQuery.FailureReason.FILE_SIZE_TOO_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$FileQuery$FailureReason[MessagingItem.FileQuery.FailureReason.FILE_SENDING_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$FileQuery$FailureReason[MessagingItem.FileQuery.FailureReason.UNSUPPORTED_FILE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private UtilsEndUserCellView() {
    }

    private static String getAttachmentLabelErrorMessage(EndUserCellFileState endUserCellFileState, Context context) {
        if (endUserCellFileState.getStatus() == MessagingItem.Query.Status.FAILED) {
            return context.getString(TAP_TO_RETRY);
        }
        return getAttachmentNonRetryableErrorMessage(endUserCellFileState, context);
    }

    private static String getAttachmentNonRetryableErrorMessage(EndUserCellFileState endUserCellFileState, Context context) {
        String string = context.getString(ATTACHMENT_COULD_NOT_BE_SENT);
        if (endUserCellFileState.getFailureReason() != null) {
            int i4 = AnonymousClass5.$SwitchMap$zendesk$classic$messaging$MessagingItem$FileQuery$FailureReason[endUserCellFileState.getFailureReason().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return context.getString(ATTACHMENT_TYPE_NOT_SUPPORTED);
                    }
                } else {
                    return context.getString(ATTACHMENTS_NOT_SUPPORTED);
                }
            } else if (endUserCellFileState.getAttachmentSettings() != null) {
                return context.getString(EXCEEDING_MAX_FILE_SIZE, UtilsAttachment.formatFileSize(context, endUserCellFileState.getAttachmentSettings().getMaxFileSize()));
            }
        }
        return string;
    }

    public static Drawable getImageLoadingPlaceholder(Context context) {
        int themeAttributeToColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, context, R.color.zui_color_primary);
        int themeAttributeToColor2 = UiUtils.themeAttributeToColor(R.attr.colorPrimaryDark, context, R.color.zui_color_primary_dark);
        float dimension = context.getResources().getDimension(R.dimen.zui_cell_bubble_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{themeAttributeToColor2, themeAttributeToColor, themeAttributeToColor2});
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set<MessagePopUpHelper.Option> getMenuOptions(MessagingItem.Query.Status status) {
        HashSet hashSet = new HashSet(2);
        if (status == MessagingItem.Query.Status.FAILED) {
            hashSet.add(MessagePopUpHelper.Option.DELETE);
            hashSet.add(MessagePopUpHelper.Option.RETRY);
            return hashSet;
        }
        if (status == MessagingItem.Query.Status.FAILED_NO_RETRY) {
            hashSet.add(MessagePopUpHelper.Option.DELETE);
        }
        return hashSet;
    }

    public static boolean isFailedCell(EndUserCellBaseState endUserCellBaseState) {
        MessagingItem.Query.Status status = endUserCellBaseState.getStatus();
        if (status != MessagingItem.Query.Status.FAILED && status != MessagingItem.Query.Status.FAILED_NO_RETRY) {
            return false;
        }
        return true;
    }

    private static void setAttachmentClickListener(final EndUserCellFileState endUserCellFileState, View view) {
        int i4 = AnonymousClass5.$SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[endUserCellFileState.getStatus().ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.UtilsEndUserCellView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        UtilsAttachment.openAttachment(view2, EndUserCellFileState.this.getAttachment().getUrl());
                    }
                });
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.UtilsEndUserCellView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (EndUserCellFileState.this.getMessageActionListener() != null) {
                        EndUserCellFileState.this.getMessageActionListener().retry(EndUserCellFileState.this.getId());
                    }
                }
            });
            return;
        }
        view.setOnClickListener(null);
    }

    public static void setCellBackground(EndUserCellBaseState endUserCellBaseState, View view) {
        if (isFailedCell(endUserCellBaseState)) {
            view.setBackgroundResource(ERROR_BACKGROUND);
            return;
        }
        if (endUserCellBaseState instanceof EndUserCellFileState) {
            view.setBackgroundResource(FILE_BACKGROUND);
            return;
        }
        Drawable drawable = view.getContext().getDrawable(USER_MESSAGE_BACKGROUND);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(UiUtils.themeAttributeToColor(R.attr.colorPrimary, view.getContext(), R.color.zui_color_primary), PorterDuff.Mode.SRC_ATOP));
            view.setBackground(drawable);
        } else {
            Logger.w(LOG_TAG, "Failed to set background, resource R.drawable.zui_background_end_user_cell could not be found", new Object[0]);
        }
    }

    public static void setClickListener(EndUserCellBaseState endUserCellBaseState, View view) {
        if (endUserCellBaseState instanceof EndUserCellMessageState) {
            setMessageClickListener((EndUserCellMessageState) endUserCellBaseState, view);
        } else if (endUserCellBaseState instanceof EndUserCellFileState) {
            setAttachmentClickListener((EndUserCellFileState) endUserCellBaseState, view);
        }
    }

    public static void setImageViewColorFilter(EndUserCellBaseState endUserCellBaseState, ImageView imageView, Context context) {
        if (isFailedCell(endUserCellBaseState)) {
            imageView.setColorFilter(UiUtils.resolveColor(ERROR_BACKGROUND_COLOR, context), PorterDuff.Mode.MULTIPLY);
        } else if (endUserCellBaseState.getStatus() == MessagingItem.Query.Status.PENDING) {
            imageView.setColorFilter(UiUtils.resolveColor(PENDING_COLOR, context), PorterDuff.Mode.MULTIPLY);
        } else {
            imageView.clearColorFilter();
        }
    }

    public static void setLabelErrorMessage(EndUserCellBaseState endUserCellBaseState, TextView textView, Context context) {
        if (!isFailedCell(endUserCellBaseState)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (endUserCellBaseState instanceof EndUserCellFileState) {
            textView.setText(getAttachmentLabelErrorMessage((EndUserCellFileState) endUserCellBaseState, context));
        } else {
            textView.setText(context.getString(TAP_TO_RETRY));
        }
    }

    public static void setLongClickListener(final EndUserCellBaseState endUserCellBaseState, final View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: zendesk.classic.messaging.ui.UtilsEndUserCellView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                MessagePopUpHelper.showPopUpMenu(view, UtilsEndUserCellView.getMenuOptions(endUserCellBaseState.getStatus()), endUserCellBaseState.getMessageActionListener(), endUserCellBaseState.getId());
                return true;
            }
        });
    }

    private static void setMessageClickListener(final EndUserCellMessageState endUserCellMessageState, View view) {
        if (endUserCellMessageState.getStatus() != MessagingItem.Query.Status.FAILED && endUserCellMessageState.getStatus() != MessagingItem.Query.Status.FAILED_NO_RETRY) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.UtilsEndUserCellView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (EndUserCellMessageState.this.getMessageActionListener() != null) {
                    EndUserCellMessageState.this.getMessageActionListener().retry(EndUserCellMessageState.this.getId());
                }
            }
        });
    }
}
