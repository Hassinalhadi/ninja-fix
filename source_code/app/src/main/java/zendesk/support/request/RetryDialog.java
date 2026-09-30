package zendesk.support.request;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.l;
import java.util.List;
import zendesk.support.R;

/* loaded from: classes.dex */
class RetryDialog extends l {
    private BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
    private Listener listener;
    private final List<StateMessage> message;

    /* loaded from: classes.dex */
    public interface Listener {
        void onDeleteMessage(List<StateMessage> list);

        void onRetryMessage(List<StateMessage> list);
    }

    public RetryDialog(Context context, List<StateMessage> list) {
        super(context);
        this.message = list;
        init();
    }

    private void init() {
        setContentView(R.layout.zs_request_dialog_retry);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.bottomSheetBehavior = initBottomSheet();
        initListener();
    }

    private BottomSheetBehavior<FrameLayout> initBottomSheet() {
        FrameLayout frameLayout = (FrameLayout) findViewById(delivery.samurai.android.R.id.design_bottom_sheet);
        if (frameLayout != null) {
            try {
                return BottomSheetBehavior.juliet(frameLayout);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private void initListener() {
        View findViewById = findViewById(R.id.request_dialog_retry_delete);
        View findViewById2 = findViewById(R.id.request_dialog_retry_retry);
        if (findViewById2 != null && findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.RetryDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onDeleteMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.RetryDialog.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (RetryDialog.this.listener != null) {
                        RetryDialog.this.listener.onRetryMessage(RetryDialog.this.message);
                    }
                    RetryDialog.this.dismiss();
                }
            });
        }
    }

    @Override // com.google.android.material.bottomsheet.l, ae.p, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.sierra(3);
        }
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
