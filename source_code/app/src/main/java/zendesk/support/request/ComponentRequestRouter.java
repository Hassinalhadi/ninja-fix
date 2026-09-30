package zendesk.support.request;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.i;
import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import x2.ad;
import x2.aw;
import x2.z;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.support.R;
import zendesk.support.request.StateError;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentRequestRouter implements Listener<RequestScreen> {
    private final i activity;
    BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu;
    private final RequestComponent component;
    private RequestView currentScreen;
    private final RequestViewConversationsDisabled disabledView;
    private final RequestViewConversationsEnabled enabledView;
    private final boolean isCleanStart;
    private final RequestViewLoading loadingView;
    private final ViewGroup root;
    private final AtomicReference<RequestScreen> screen = new AtomicReference<>();

    /* renamed from: zendesk.support.request.ComponentRequestRouter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen;

        static {
            int[] iArr = new int[RequestScreen.values().length];
            $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen = iArr;
            try {
                iArr[RequestScreen.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen[RequestScreen.EmailForm.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen[RequestScreen.Conversation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen[RequestScreen.Fin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RequestRouterSelector implements StateSelector<RequestScreen> {
        @Override // zendesk.support.suas.StateSelector
        public RequestScreen selectData(State state) {
            StateConfig fromState = StateConfig.fromState(state);
            StateConversation fromState2 = StateConversation.fromState(state);
            StateSettings settings = fromState.getSettings();
            StateError fromState3 = StateError.fromState(state);
            boolean hasSettings = settings.hasSettings();
            boolean hasLength = StringUtils.hasLength(fromState2.getRemoteId());
            boolean isConversationsEnabled = settings.isConversationsEnabled();
            boolean hasIdentityEmailAddress = settings.hasIdentityEmailAddress();
            boolean isNeverRequestEmailOn = settings.isNeverRequestEmailOn();
            if (fromState3.getState() == StateError.ErrorType.NoAccess) {
                Logger.e("RequestActivity", "Network returned 'No Access'. Ticket is not longer valid. Error: '%s'", fromState3.getMessage());
                return RequestScreen.Fin;
            }
            if (!hasSettings) {
                return RequestScreen.Loading;
            }
            if (isConversationsEnabled) {
                return RequestScreen.Conversation;
            }
            if (hasLength) {
                Logger.w("RequestActivity", "Conversations are disabled. Exiting RequestActivity", new Object[0]);
                return RequestScreen.Fin;
            }
            if (!hasIdentityEmailAddress && isNeverRequestEmailOn) {
                Logger.w("RequestActivity", "Conversations are disabled, never request email is enabled, with this configuration tickets would go into a black hole. Exiting RequestActivity.", new Object[0]);
                return RequestScreen.Fin;
            }
            return RequestScreen.EmailForm;
        }
    }

    /* loaded from: classes.dex */
    public enum RequestScreen {
        Loading,
        EmailForm,
        Conversation,
        Fin
    }

    public ComponentRequestRouter(i iVar, ViewGroup viewGroup, RequestViewConversationsDisabled requestViewConversationsDisabled, RequestViewConversationsEnabled requestViewConversationsEnabled, RequestViewLoading requestViewLoading, RequestComponent requestComponent, boolean z2, BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        this.activity = iVar;
        this.root = viewGroup;
        this.disabledView = requestViewConversationsDisabled;
        this.enabledView = requestViewConversationsEnabled;
        this.loadingView = requestViewLoading;
        this.component = requestComponent;
        this.isCleanStart = z2;
        this.bottomSheetAttachmentViewMenu = bottomSheetAttachmentViewMenu;
    }

    public static ComponentRequestRouter create(i iVar, boolean z2, RequestComponent requestComponent, BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        return new ComponentRequestRouter(iVar, (ViewGroup) iVar.findViewById(R.id.activity_request_root), (RequestViewConversationsDisabled) iVar.findViewById(R.id.activity_request_conversation_disabled), (RequestViewConversationsEnabled) iVar.findViewById(R.id.activity_request_conversation), (RequestViewLoading) iVar.findViewById(R.id.activity_request_loading), requestComponent, z2, bottomSheetAttachmentViewMenu);
    }

    private void displayView(View view, View... viewArr) {
        ad.alpha(this.root, new aw());
        view.setVisibility(0);
        for (View view2 : viewArr) {
            view2.setVisibility(8);
        }
        this.activity.invalidateOptionsMenu();
        ViewGroup viewGroup = this.root;
        ad.charlie.remove(viewGroup);
        ArrayList arrayList = (ArrayList) ad.bravo().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((z) arrayList2.get(size)).november(viewGroup);
            }
        }
    }

    public RequestView getCurrentScreen() {
        return this.currentScreen;
    }

    public StateSelector<RequestScreen> getSelector() {
        return new RequestRouterSelector();
    }

    @Override // zendesk.support.suas.Listener
    public void update(RequestScreen requestScreen) {
        if (this.screen.getAndSet(requestScreen) == requestScreen) {
            return;
        }
        int i4 = AnonymousClass1.$SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen[requestScreen.ordinal()];
        if (i4 == 1) {
            Logger.d("RequestActivity", "Installing screen: 'Loading Screen'", new Object[0]);
            RequestViewLoading requestViewLoading = this.loadingView;
            this.currentScreen = requestViewLoading;
            displayView(requestViewLoading, this.disabledView, this.enabledView);
            return;
        }
        if (i4 == 2) {
            Logger.d("RequestActivity", "Installing screen: 'Conversations Disabled Screen'", new Object[0]);
            RequestViewConversationsDisabled requestViewConversationsDisabled = this.disabledView;
            this.currentScreen = requestViewConversationsDisabled;
            displayView(requestViewConversationsDisabled, this.enabledView, this.loadingView);
            this.disabledView.init(this.component, this.bottomSheetAttachmentViewMenu);
            return;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                return;
            }
            Logger.d("RequestActivity", "Installing screen: 'Finish'", new Object[0]);
            this.activity.finish();
            return;
        }
        Logger.d("RequestActivity", "Installing screen: 'Conversations Enabled Screen'", new Object[0]);
        RequestViewConversationsEnabled requestViewConversationsEnabled = this.enabledView;
        this.currentScreen = requestViewConversationsEnabled;
        displayView(requestViewConversationsEnabled, this.disabledView, this.loadingView);
        this.enabledView.init(this.component, this.isCleanStart, this.bottomSheetAttachmentViewMenu);
    }
}
