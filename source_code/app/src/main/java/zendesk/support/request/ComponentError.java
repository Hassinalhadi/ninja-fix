package zendesk.support.request;

import android.app.Activity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import i7.C1901g;
import zendesk.support.R;
import zendesk.support.request.StateError;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentError implements Listener<ErrorStateModel> {

    /* renamed from: af, reason: collision with root package name */
    private final ActionFactory f14275af;
    private final CoordinatorLayout container;
    private final Dispatcher dispatcher;
    private StateError.ErrorType errorState;
    private C1901g snackbar;

    /* renamed from: zendesk.support.request.ComponentError$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$StateError$ErrorType;

        static {
            int[] iArr = new int[StateError.ErrorType.values().length];
            $SwitchMap$zendesk$support$request$StateError$ErrorType = iArr;
            try {
                iArr[StateError.ErrorType.InitialGetComments.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$request$StateError$ErrorType[StateError.ErrorType.InputFormSubmission.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ErrorStateModel {
        private final boolean conversationsEnabled;
        private final String errorMessage;
        private final StateError.ErrorType errorState;

        public ErrorStateModel(StateError.ErrorType errorType, String str, boolean z2) {
            this.errorState = errorType;
            this.errorMessage = str;
            this.conversationsEnabled = z2;
        }

        public String getErrorMessage() {
            return this.errorMessage;
        }

        public StateError.ErrorType getErrorState() {
            return this.errorState;
        }

        public boolean isConversationsEnabled() {
            return this.conversationsEnabled;
        }
    }

    /* loaded from: classes.dex */
    public static class ErrorStateSelector implements StateSelector<ErrorStateModel> {
        @Override // zendesk.support.suas.StateSelector
        public ErrorStateModel selectData(State state) {
            StateError fromState = StateError.fromState(state);
            return new ErrorStateModel(fromState.getState(), fromState.getMessage(), StateConfig.fromState(state).getSettings().isConversationsEnabled());
        }
    }

    private ComponentError(CoordinatorLayout coordinatorLayout, Dispatcher dispatcher, ActionFactory actionFactory) {
        this.container = coordinatorLayout;
        this.dispatcher = dispatcher;
        this.f14275af = actionFactory;
    }

    public static ComponentError create(Activity activity, Dispatcher dispatcher, ActionFactory actionFactory) {
        return new ComponentError((CoordinatorLayout) activity.findViewById(R.id.activity_request), dispatcher, actionFactory);
    }

    public static StateSelector<ErrorStateModel> getSelector() {
        return new ErrorStateSelector();
    }

    @Override // zendesk.support.suas.Listener
    public void update(ErrorStateModel errorStateModel) {
        if (errorStateModel.errorState == this.errorState) {
            return;
        }
        this.errorState = errorStateModel.errorState;
        if (errorStateModel.errorState != StateError.ErrorType.NoError) {
            this.snackbar = C1901g.hotel(this.container, errorStateModel.getErrorMessage(), -2);
            int i4 = AnonymousClass2.$SwitchMap$zendesk$support$request$StateError$ErrorType[errorStateModel.getErrorState().ordinal()];
            if (i4 != 1) {
                if (i4 == 2 && !errorStateModel.isConversationsEnabled()) {
                    C1901g c1901g = this.snackbar;
                    ((SnackbarContentLayout) c1901g.india.getChildAt(0)).getMessageView().setText(c1901g.hotel.getText(R.string.request_error_create_request));
                    this.snackbar.juliet();
                    return;
                }
                return;
            }
            C1901g c1901g2 = this.snackbar;
            ((SnackbarContentLayout) c1901g2.india.getChildAt(0)).getMessageView().setText(c1901g2.hotel.getText(R.string.request_error_load_comments));
            C1901g c1901g3 = this.snackbar;
            int i5 = R.string.retry_view_button_label;
            c1901g3.india(c1901g3.hotel.getText(i5), new View.OnClickListener() { // from class: zendesk.support.request.ComponentError.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ComponentError.this.errorState = StateError.ErrorType.NoError;
                    ComponentError.this.dispatcher.dispatch(ComponentError.this.f14275af.initialLoadCommentsAsync());
                }
            });
            this.snackbar.juliet();
            return;
        }
        C1901g c1901g4 = this.snackbar;
        if (c1901g4 != null) {
            c1901g4.alpha(3);
        }
    }
}
