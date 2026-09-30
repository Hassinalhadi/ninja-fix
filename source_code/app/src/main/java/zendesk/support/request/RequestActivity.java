package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import com.google.gson.q;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import i7.C1901g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import zendesk.commonui.BottomSheetAttachmentAction;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.commonui.InsetType;
import zendesk.commonui.PermissionsHandler;
import zendesk.commonui.PhotoPickerLifecycleObserver;
import zendesk.commonui.PhotoPickerSelectionCallback;
import zendesk.commonui.SystemWindowInsets;
import zendesk.configurations.ConfigurationUtil;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.Constants;
import zendesk.support.R;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.State;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;

/* loaded from: classes.dex */
public class RequestActivity extends i implements PhotoPickerSelectionCallback {
    static final boolean DEBUG = false;
    private static final String[] INPUT_DOCUMENT_MIME_TYPES = {"*/*"};
    private static final String INPUT_URI = "INPUT_URI";
    static final String LOG_TAG = "RequestActivity";
    private static final int REQUEST_CAMERA_PERMISSION = 1001;
    private static final String SAVED_STATE = "saved_state";
    private RequestAccessibilityHerald accessibilityHerald;
    ActionFactory actionFactory;
    ActionHandlerRegistry actionHandlerRegistry;
    HeadlessComponentListener headlessComponentListener;
    private Uri inputUri;
    MediaResultUtility mediaResultUtility;
    PermissionsHandler permissionsHandler;
    private PhotoPickerLifecycleObserver photoPickerVisualMedia;
    Picasso picasso;
    private RefreshRequestActionHandler refreshActionHandler;
    private RequestComponent requestComponent;
    private ComponentRequestRouter requestRouter;
    Store store;
    private Subscription subscription;

    /* renamed from: zendesk.support.request.RequestActivity$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements BottomSheetAttachmentAction {
        public AnonymousClass1() {
        }

        @Override // zendesk.commonui.BottomSheetAttachmentAction
        public void onSelectDocumentClicked() {
            RequestActivity.this.photoPickerVisualMedia.selectDocument(RequestActivity.INPUT_DOCUMENT_MIME_TYPES);
        }

        @Override // zendesk.commonui.BottomSheetAttachmentAction
        public void onSelectMediaClicked() {
            RequestActivity.this.photoPickerVisualMedia.selectMedia();
        }

        @Override // zendesk.commonui.BottomSheetAttachmentAction
        public void onTakePhotoClicked() {
            RequestActivity requestActivity = RequestActivity.this;
            requestActivity.inputUri = requestActivity.mediaResultUtility.createUriToSaveTakenPicture();
            if (RequestActivity.this.permissionsHandler.checkPermission("android.permission.CAMERA")) {
                RequestActivity.this.photoPickerVisualMedia.takePicture(RequestActivity.this.inputUri);
            } else {
                RequestActivity.this.permissionsHandler.requestPermission("android.permission.CAMERA", 1001);
            }
        }
    }

    /* renamed from: zendesk.support.request.RequestActivity$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements DialogInterface.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: zendesk.support.request.RequestActivity$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements DialogInterface.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            RequestActivity.super.onBackPressed();
        }
    }

    /* renamed from: zendesk.support.request.RequestActivity$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RequestActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes.dex */
    public static class MoveUpWithSnackbarBehaviour extends AppBarLayout.ScrollingViewBehavior {
        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!(view2 instanceof AppBarLayout) && !(view2 instanceof Snackbar$SnackbarLayout)) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (view2 instanceof Snackbar$SnackbarLayout) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) Math.abs(Math.min(0.0f, view2.getTranslationY() - view2.getHeight())));
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public final class RefreshRequestActionHandler implements ActionHandler {
        private final String requestId;

        public RefreshRequestActionHandler(String str) {
            this.requestId = str;
        }

        @Override // zendesk.core.ActionHandler
        public boolean canHandle(String str) {
            if (str.contains(Constants.ACTION_REFRESH_REQUEST_CONVERSATION) && str.contains(this.requestId)) {
                return true;
            }
            return false;
        }

        @Override // zendesk.core.ActionHandler
        public ActionDescription getActionDescription() {
            return null;
        }

        @Override // zendesk.core.ActionHandler
        public int getPriority() {
            return 0;
        }

        @Override // zendesk.core.ActionHandler
        public void handle(Map<String, Object> map, Context context) {
            RequestActivity requestActivity = RequestActivity.this;
            requestActivity.store.dispatch(requestActivity.actionFactory.updateCommentsAsync());
        }

        @Override // zendesk.core.ActionHandler
        public void updateSettings(Map<String, q> map) {
        }
    }

    private Subscription bindComponents(boolean z2) {
        ComponentToolbar bindToolbar = bindToolbar();
        ComponentError create = ComponentError.create(this, this.store, this.actionFactory);
        this.requestRouter = ComponentRequestRouter.create(this, z2, this.requestComponent, createBottomSheetAttachmentMenu());
        this.accessibilityHerald = RequestAccessibilityHerald.create(this);
        return CombinedSubscription.from(this.store.addListener(bindToolbar.getToolbarSelector(), bindToolbar), this.store.addListener(this.requestRouter.getSelector(), this.requestRouter), this.store.addListener(ComponentError.getSelector(), create), this.store.addActionListener(this.accessibilityHerald));
    }

    @SuppressLint({"PrivateResource"})
    private ComponentToolbar bindToolbar() {
        View findViewById = findViewById(R.id.activity_request_appbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_request_toolbar);
        SystemWindowInsets.applyWindowInsets(findViewById, InsetType.TOP);
        SystemWindowInsets.applyWindowInsets(toolbar, InsetType.HORIZONTAL);
        ViewAlmostRealProgressBar viewAlmostRealProgressBar = (ViewAlmostRealProgressBar) findViewById(R.id.activity_request_progressbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.RequestActivity.4
            public AnonymousClass4() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestActivity.this.onBackPressed();
            }
        });
        findViewById(R.id.activity_request_compat_toolbar_shadow).setVisibility(8);
        return new ComponentToolbar(this.picasso, toolbar, viewAlmostRealProgressBar);
    }

    public static RequestConfiguration.Builder builder() {
        return new RequestConfiguration.Builder();
    }

    private BottomSheetAttachmentAction createBottomSheetAttachmentActionCallback() {
        return new BottomSheetAttachmentAction() { // from class: zendesk.support.request.RequestActivity.1
            public AnonymousClass1() {
            }

            @Override // zendesk.commonui.BottomSheetAttachmentAction
            public void onSelectDocumentClicked() {
                RequestActivity.this.photoPickerVisualMedia.selectDocument(RequestActivity.INPUT_DOCUMENT_MIME_TYPES);
            }

            @Override // zendesk.commonui.BottomSheetAttachmentAction
            public void onSelectMediaClicked() {
                RequestActivity.this.photoPickerVisualMedia.selectMedia();
            }

            @Override // zendesk.commonui.BottomSheetAttachmentAction
            public void onTakePhotoClicked() {
                RequestActivity requestActivity = RequestActivity.this;
                requestActivity.inputUri = requestActivity.mediaResultUtility.createUriToSaveTakenPicture();
                if (RequestActivity.this.permissionsHandler.checkPermission("android.permission.CAMERA")) {
                    RequestActivity.this.photoPickerVisualMedia.takePicture(RequestActivity.this.inputUri);
                } else {
                    RequestActivity.this.permissionsHandler.requestPermission("android.permission.CAMERA", 1001);
                }
            }
        };
    }

    private BottomSheetAttachmentViewMenu createBottomSheetAttachmentMenu() {
        return new BottomSheetAttachmentViewMenu(this, Arrays.asList(getString(R.string.zui_label_camera_menu), getString(R.string.zui_label_gallery_menu), getString(R.string.zui_label_document_menu)), createBottomSheetAttachmentActionCallback());
    }

    private PhotoPickerLifecycleObserver createPhotoPickerResultLauncher() {
        return new PhotoPickerLifecycleObserver(getActivityResultRegistry(), this, new Function0() { // from class: zendesk.support.request.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Uri lambda$createPhotoPickerResultLauncher$0;
                lambda$createPhotoPickerResultLauncher$0 = RequestActivity.this.lambda$createPhotoPickerResultLauncher$0();
                return lambda$createPhotoPickerResultLauncher$0;
            }
        });
    }

    private void initViews() {
        View findViewById = findViewById(R.id.activity_request_root);
        SystemWindowInsets.applyWindowInsets(findViewById, InsetType.HORIZONTAL, InsetType.BOTTOM);
        ((f) findViewById.getLayoutParams()).bravo(new MoveUpWithSnackbarBehaviour());
    }

    private boolean initializeStoreAndDependencies(Bundle bundle, RequestConfiguration requestConfiguration) {
        if (injectDependencies(requestConfiguration)) {
            return false;
        }
        State restoreState = restoreState(bundle);
        if (restoreState != null) {
            this.store.reset(restoreState);
            return false;
        }
        return true;
    }

    private boolean injectDependencies(RequestConfiguration requestConfiguration) {
        boolean z2;
        RequestComponent requestComponent = (RequestComponent) HeadlessFragment.getData(getSupportFragmentManager());
        this.requestComponent = requestComponent;
        if (requestComponent == null) {
            this.requestComponent = SdkDependencyProvider.INSTANCE.provideSupportSdkComponent().plus(new RequestModule(this, requestConfiguration));
            HeadlessFragment.install(getSupportFragmentManager(), this.requestComponent);
            z2 = false;
        } else {
            z2 = true;
        }
        this.requestComponent.inject(this);
        return z2;
    }

    public /* synthetic */ Uri lambda$createPhotoPickerResultLauncher$0() {
        return this.inputUri;
    }

    public /* synthetic */ void lambda$onRequestPermissionsResult$1(View view) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    private State restoreState(Bundle bundle) {
        if (bundle != null && bundle.containsKey(SAVED_STATE)) {
            return (State) bundle.getSerializable(SAVED_STATE);
        }
        return null;
    }

    @Override // ae.o, android.app.Activity
    public void onBackPressed() {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null && currentScreen.hasUnsavedInput()) {
            Fe.c cVar = new Fe.c(this);
            int i4 = R.string.request_dialog_title_unsaved_changes;
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
            dVar.delta = dVar.alpha.getText(i4);
            dVar.foxtrot = dVar.alpha.getText(R.string.request_dialog_body_unsaved_changes);
            int i5 = R.string.request_dialog_button_label_delete;
            AnonymousClass3 anonymousClass3 = new DialogInterface.OnClickListener() { // from class: zendesk.support.request.RequestActivity.3
                public AnonymousClass3() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i42) {
                    RequestActivity.super.onBackPressed();
                }
            };
            dVar.golf = dVar.alpha.getText(i5);
            dVar.hotel = anonymousClass3;
            int i10 = R.string.request_dialog_button_label_cancel;
            AnonymousClass2 anonymousClass2 = new DialogInterface.OnClickListener() { // from class: zendesk.support.request.RequestActivity.2
                public AnonymousClass2() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i42) {
                    dialogInterface.dismiss();
                }
            };
            dVar.india = dVar.alpha.getText(i10);
            dVar.juliet = anonymousClass2;
            cVar.november();
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.inputUri = (Uri) bundle.getParcelable(INPUT_URI);
        }
        getTheme().applyStyle(R.style.ZendeskActivityDefaultTheme, true);
        setContentView(R.layout.zs_activity_request);
        this.photoPickerVisualMedia = createPhotoPickerResultLauncher();
        getLifecycle().alpha(this.photoPickerVisualMedia);
        initViews();
        if (!SdkDependencyProvider.INSTANCE.isInitialized()) {
            Logger.e(LOG_TAG, SdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        RequestConfiguration requestConfiguration = (RequestConfiguration) ConfigurationUtil.fromBundle(getIntent().getExtras(), RequestConfiguration.class);
        if (requestConfiguration == null) {
            Logger.e(LOG_TAG, "No configuration found. Please use RequestActivity.builder()", new Object[0]);
            finish();
            return;
        }
        this.refreshActionHandler = new RefreshRequestActionHandler(requestConfiguration.getRequestId());
        boolean initializeStoreAndDependencies = initializeStoreAndDependencies(bundle, requestConfiguration);
        if (initializeStoreAndDependencies) {
            this.headlessComponentListener.startListening(this.store);
            this.store.dispatch(this.actionFactory.installStartConfigAsync(requestConfiguration));
            this.store.dispatch(this.actionFactory.loadSettingsAsync());
        }
        this.subscription = bindComponents(initializeStoreAndDependencies);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null && currentScreen.inflateMenu(getMenuInflater(), menu)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getLifecycle().charlie(this.photoPickerVisualMedia);
    }

    @Override // zendesk.commonui.PhotoPickerSelectionCallback
    public void onMediaSelected(List<Uri> list) {
        this.store.dispatch(this.actionFactory.selectAttachment(this.mediaResultUtility.getListOfSelectedMedia(list)));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        RequestView currentScreen = this.requestRouter.getCurrentScreen();
        if (currentScreen != null) {
            return currentScreen.onOptionsItemClicked(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onPause() {
        super.onPause();
        Store store = this.store;
        if (store != null) {
            store.dispatch(this.actionFactory.androidOnPause());
        }
        Subscription subscription = this.subscription;
        if (subscription != null) {
            subscription.removeListener();
        }
        ActionHandlerRegistry actionHandlerRegistry = this.actionHandlerRegistry;
        if (actionHandlerRegistry != null) {
            actionHandlerRegistry.remove(this.refreshActionHandler);
        }
    }

    @Override // zendesk.commonui.PhotoPickerSelectionCallback
    public void onPhotoTaken(Uri uri) {
        this.store.dispatch(this.actionFactory.selectAttachment(this.mediaResultUtility.getListOfSelectedMedia(uri)));
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 == 1001) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.photoPickerVisualMedia.takePicture(this.inputUri);
                return;
            }
            C1901g golf = C1901g.golf(findViewById(R.id.activity_request_root), zendesk.classic.messaging.R.string.zui_camera_permission_denied, 0);
            golf.india(getString(zendesk.classic.messaging.R.string.zui_camera_permission_denied_settings), new a(1, this));
            golf.juliet();
        }
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onResume() {
        super.onResume();
        this.store.dispatch(this.actionFactory.androidOnResume());
        this.subscription.addListener();
        this.subscription.informWithCurrentState();
        this.actionHandlerRegistry.add(this.refreshActionHandler);
    }

    @Override // ae.o, f1.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable(SAVED_STATE, this.store.getState());
        bundle.putParcelable(INPUT_URI, this.inputUri);
        super.onSaveInstanceState(bundle);
    }
}
