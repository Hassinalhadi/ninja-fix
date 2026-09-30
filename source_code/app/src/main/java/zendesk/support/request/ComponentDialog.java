package zendesk.support.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.request.RetryDialog;
import zendesk.support.request.StateUi;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;

/* loaded from: classes.dex */
class ComponentDialog implements Listener<StateUi> {
    private final Activity activity;

    /* renamed from: af, reason: collision with root package name */
    private final ActionFactory f14272af;
    private Dialog dialog;
    private final Dispatcher dispatcher;

    /* loaded from: classes.dex */
    public static class OnDismissedListener implements DialogInterface.OnDismissListener {

        /* renamed from: af, reason: collision with root package name */
        private final ActionFactory f14273af;
        private final Dispatcher dispatcher;

        public OnDismissedListener(ActionFactory actionFactory, Dispatcher dispatcher) {
            this.f14273af = actionFactory;
            this.dispatcher = dispatcher;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.dispatcher.dispatch(this.f14273af.onDialogDismissed());
        }
    }

    /* loaded from: classes.dex */
    public static class RetryDialogListener implements RetryDialog.Listener {

        /* renamed from: af, reason: collision with root package name */
        private final ActionFactory f14274af;
        private final Dispatcher dispatcher;

        public RetryDialogListener(ActionFactory actionFactory, Dispatcher dispatcher) {
            this.f14274af = actionFactory;
            this.dispatcher = dispatcher;
        }

        @Override // zendesk.support.request.RetryDialog.Listener
        public void onDeleteMessage(List<StateMessage> list) {
            Iterator<StateMessage> it = list.iterator();
            while (it.hasNext()) {
                this.dispatcher.dispatch(this.f14274af.deleteMessage(it.next()));
            }
        }

        @Override // zendesk.support.request.RetryDialog.Listener
        public void onRetryMessage(List<StateMessage> list) {
            onDeleteMessage(list);
            Iterator<StateMessage> it = list.iterator();
            while (it.hasNext()) {
                this.dispatcher.dispatch(this.f14274af.resendCommentAsync(it.next()));
                this.dispatcher.dispatch(this.f14274af.updateCommentsAsync());
            }
        }
    }

    public ComponentDialog(Activity activity, ActionFactory actionFactory, Dispatcher dispatcher) {
        this.activity = activity;
        this.f14272af = actionFactory;
        this.dispatcher = dispatcher;
    }

    private Dialog getDialogForState(StateUi.DialogState dialogState) {
        if (dialogState instanceof StateRetryDialog) {
            RetryDialog retryDialog = new RetryDialog(this.activity, ((StateRetryDialog) dialogState).getMessage());
            retryDialog.setListener(new RetryDialogListener(this.f14272af, this.dispatcher));
            return retryDialog;
        }
        return null;
    }

    @Override // zendesk.support.suas.Listener
    public void update(StateUi stateUi) {
        StateUi.DialogState dialogState = stateUi.getDialogState();
        if (dialogState != null) {
            Dialog dialog = this.dialog;
            if (dialog == null || !dialog.isShowing()) {
                UiUtils.dismissKeyboard(this.activity);
                Dialog dialogForState = getDialogForState(dialogState);
                this.dialog = dialogForState;
                dialogForState.setOnDismissListener(new OnDismissedListener(this.f14272af, this.dispatcher));
                this.dialog.show();
            }
        }
    }
}
