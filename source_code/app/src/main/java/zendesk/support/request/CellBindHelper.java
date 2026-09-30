package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import zendesk.support.R;
import zendesk.support.request.CellType;
import zendesk.support.suas.Dispatcher;

/* loaded from: classes.dex */
class CellBindHelper {

    /* renamed from: af, reason: collision with root package name */
    private final ActionFactory f14271af;
    private final CellAttachmentLoadingUtil attachmentUtil;
    private final Context context;
    private final Dispatcher dispatcher;
    private final MediaResultUtility mediaResultUtility;
    private final String today;
    private final String yesterday;

    public CellBindHelper(Context context, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher, MediaResultUtility mediaResultUtility) {
        this.context = context;
        this.f14271af = actionFactory;
        this.dispatcher = dispatcher;
        this.attachmentUtil = new CellAttachmentLoadingUtil(picasso, context);
        this.today = context.getString(R.string.request_message_date_today);
        this.yesterday = context.getString(R.string.request_message_date_yesterday);
        this.mediaResultUtility = mediaResultUtility;
    }

    private boolean basicCellChecks(CellType.Base base, CellType.Base base2) {
        if (base == base2) {
            return true;
        }
        if (base.getPositionType() == base2.getPositionType() && base.getClass().isInstance(base2)) {
            return true;
        }
        return false;
    }

    private int getPixelForDp(int i4) {
        if (i4 != 0) {
            return this.context.getResources().getDimensionPixelOffset(i4);
        }
        return 0;
    }

    private boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAttachment(Context context, StateRequestAttachment stateRequestAttachment) {
        Intent viewIntent = getViewIntent(stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getMimeType());
        if (context.getPackageManager().queryIntentActivities(viewIntent, 0).size() > 0) {
            context.startActivity(viewIntent);
        }
    }

    public void addOnClickListenerForFileAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setAlpha(1.0f);
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    CellBindHelper.this.openAttachment(view2.getContext(), stateRequestAttachment);
                }
            });
        } else {
            view.setAlpha(this.context.getResources().getInteger(R.integer.zs_request_file_attachment_downloading_cell_alpha) / 100.0f);
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.2
                private final String toastMessage;

                {
                    this.toastMessage = CellBindHelper.this.context.getString(R.string.request_file_attachment_download_in_progress);
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Toast.makeText(view2.getContext(), this.toastMessage, 0).show();
                }
            });
        }
    }

    public void addOnClickListenerForImageAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    CellBindHelper.this.openAttachment(view2.getContext(), stateRequestAttachment);
                }
            });
        } else {
            view.setOnClickListener(null);
        }
    }

    public boolean areAgentCellContentsTheSame(CellType.Agent agent, CellType.Base base) {
        boolean z2;
        boolean z10;
        if (!basicCellChecks(agent, base) || !(base instanceof CellType.Agent)) {
            return false;
        }
        CellType.Agent agent2 = (CellType.Agent) base;
        if (agent.getAgent().getId() == agent2.getAgent().getId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean equals = agent.getAgent().getName().equals(agent2.getAgent().getName());
        if (agent.isAgentNameVisible() == agent2.isAgentNameVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z2 || !equals || !z10) {
            return false;
        }
        return true;
    }

    public boolean areAttachmentCellContentsTheSame(CellType.Attachment attachment, CellType.Base base) {
        if (!basicCellChecks(attachment, base) || !(base instanceof CellType.Attachment)) {
            return false;
        }
        StateRequestAttachment attachment2 = attachment.getAttachment();
        StateRequestAttachment attachment3 = ((CellType.Attachment) base).getAttachment();
        boolean nullSafeEquals = nullSafeEquals(attachment2.getLocalFile(), attachment3.getLocalFile());
        boolean nullSafeEquals2 = nullSafeEquals(attachment2.getLocalUri(), attachment3.getLocalUri());
        boolean nullSafeEquals3 = nullSafeEquals(attachment2.getUrl(), attachment3.getUrl());
        if (!nullSafeEquals || !nullSafeEquals2 || !nullSafeEquals3) {
            return false;
        }
        return true;
    }

    public boolean areMessageContentsTheSame(CellType.Message message, CellType.Base base) {
        if (!basicCellChecks(message, base) || !(base instanceof CellType.Message)) {
            return false;
        }
        return message.getMessage().equals(((CellType.Message) base).getMessage());
    }

    public boolean areStatefulCellContentsTheSame(CellType.Stateful stateful, CellType.Base base) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        if (!basicCellChecks(stateful, base) || !(base instanceof CellType.Stateful)) {
            return false;
        }
        CellType.Stateful stateful2 = (CellType.Stateful) base;
        if (stateful.isErrorShown() == stateful2.isErrorShown()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (stateful.isMarkedAsDelivered() == stateful2.isMarkedAsDelivered()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (stateful.getErrorGroupMessages().size() == stateful2.getErrorGroupMessages().size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (stateful.isLastErrorCellOfBlock() == stateful2.isLastErrorCellOfBlock()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z2 || !z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    public void bindAgentName(TextView textView, boolean z2, StateRequestUser stateRequestUser) {
        if (z2) {
            textView.setVisibility(0);
            textView.setText(stateRequestUser.getName());
        } else {
            textView.setVisibility(4);
        }
    }

    public void bindAppInfo(ResolveInfo resolveInfo, TextView textView, ImageView imageView) {
        textView.setText(UtilsAttachment.getAppName(this.context, resolveInfo));
        imageView.setImageDrawable(UtilsAttachment.getAppIcon(this.context, resolveInfo));
    }

    public void bindDate(TextView textView, Date date) {
        String format;
        if (UtilsDate.isToday(date)) {
            format = this.today;
        } else if (UtilsDate.isYesterday(date)) {
            format = this.yesterday;
        } else {
            format = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault()).format(date);
        }
        textView.setText(format.toUpperCase(Locale.getDefault()));
    }

    public void bindImage(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
        this.attachmentUtil.bindImage(imageView, stateRequestAttachment);
    }

    public void bindStatusLabel(TextView textView, boolean z2, boolean z10) {
        int i4;
        int i5;
        int i10 = 0;
        if (z2) {
            i4 = R.color.zs_request_cell_label_color_error;
            i5 = R.string.request_messages_status_error;
        } else if (z10) {
            i4 = R.color.zs_request_cell_label_color;
            i5 = R.string.request_message_status_delivered;
        } else {
            i4 = -1;
            i10 = 4;
            i5 = -1;
        }
        if (i4 > 0) {
            textView.setTextColor(this.context.getColor(i4));
        }
        if (i5 > 0) {
            textView.setText(i5);
        }
        textView.clearAnimation();
        if (i10 == 0 && i10 != textView.getVisibility()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250L);
            alphaAnimation.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f));
            textView.startAnimation(alphaAnimation);
        }
        textView.setVisibility(i10);
    }

    public int colorForError(boolean z2) {
        int i4;
        if (z2) {
            i4 = R.color.zs_request_user_background_color_error;
        } else {
            i4 = R.color.zs_request_user_background_color;
        }
        return this.context.getColor(i4);
    }

    public int colorForErrorImage(boolean z2) {
        if (z2) {
            return this.context.getColor(R.color.zs_request_user_background_image_color_error);
        }
        return 0;
    }

    public View.OnClickListener errorClickListener(boolean z2, final List<StateMessage> list) {
        if (z2) {
            return new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CellBindHelper.this.dispatcher.dispatch(CellBindHelper.this.f14271af.showRetryDialog(list));
                }
            };
        }
        return null;
    }

    public ResolveInfo getAppInfo(String str) {
        return UtilsAttachment.getAppInfoForFile(this.context, this.mediaResultUtility.getMediaResultFromFile("tmp", str));
    }

    public Rect getInsets(int i4, int i5, int i10, int i11) {
        return new Rect(getPixelForDp(i4), getPixelForDp(i5), getPixelForDp(i10), getPixelForDp(i11));
    }

    public Intent getViewIntent(Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent.setDataAndType(uri, str);
        }
        grantPermissionsForUri(intent, uri);
        return intent;
    }

    public void grantPermissionsForUri(Intent intent, Uri uri) {
        intent.addFlags(3);
    }
}
