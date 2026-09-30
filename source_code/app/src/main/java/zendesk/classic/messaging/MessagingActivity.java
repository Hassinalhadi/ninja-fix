package zendesk.classic.messaging;

import Jb.C0211t;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.A;
import androidx.lifecycle.au;
import com.clevertap.android.sdk.inapp.fragment.a;
import com.google.android.material.appbar.AppBarLayout;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import i7.C1901g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import x.j;
import zendesk.classic.messaging.Banner;
import zendesk.classic.messaging.MessagingConfiguration;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.ui.InputBox;
import zendesk.classic.messaging.ui.MessagingCellFactory;
import zendesk.classic.messaging.ui.MessagingComposer;
import zendesk.classic.messaging.ui.MessagingState;
import zendesk.classic.messaging.ui.MessagingView;
import zendesk.commonui.BottomSheetAttachmentAction;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.commonui.CacheFragment;
import zendesk.commonui.InsetType;
import zendesk.commonui.PermissionsHandler;
import zendesk.commonui.PhotoPickerLifecycleObserver;
import zendesk.commonui.PhotoPickerSelectionCallback;
import zendesk.commonui.SystemWindowInsets;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.MediaFileResolver;

@SuppressLint({"MissingInflatedId"})
/* loaded from: classes.dex */
public class MessagingActivity extends i implements PhotoPickerSelectionCallback {
    private static final String COMPONENT_KEY = "messaging_component";
    private static final String[] INPUT_DOCUMENT_MIME_TYPES = {"*/*"};
    private static final String INPUT_URI = "INPUT_URI";
    private static final String LOG_TAG = "MessagingActivity";
    public static final String NO_ENGINES_ERROR_LOG = "No Engines found in MessagingConfiguration. Please use MessagingActivity.builder()";
    private static final int REQUEST_CAMERA_PERMISSION = 1001;
    EventFactory eventFactory;
    private Uri inputUri;
    MediaFileResolver mediaFileResolver;
    MediaInMemoryDataSource mediaHolder;
    MessagingCellFactory messagingCellFactory;
    MessagingComposer messagingComposer;
    MessagingDialog messagingDialog;
    private MessagingView messagingView;
    PermissionsHandler permissionsHandler;
    private PhotoPickerLifecycleObserver photoPicker;
    Picasso picasso;
    MessagingViewModel viewModel;

    /* renamed from: zendesk.classic.messaging.MessagingActivity$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessagingActivity.this.finish();
        }
    }

    /* renamed from: zendesk.classic.messaging.MessagingActivity$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements BottomSheetAttachmentAction {
        public AnonymousClass2() {
        }

        @Override // zendesk.commonui.BottomSheetAttachmentAction
        public void onSelectDocumentClicked() {
            MessagingActivity.this.photoPicker.selectDocument(MessagingActivity.INPUT_DOCUMENT_MIME_TYPES);
        }

        @Override // zendesk.commonui.BottomSheetAttachmentAction
        public void onSelectMediaClicked() {
            MessagingActivity.this.photoPicker.selectMedia();
        }

        @Override // zendesk.commonui.BottomSheetAttachmentAction
        public void onTakePhotoClicked() {
            MessagingActivity messagingActivity = MessagingActivity.this;
            messagingActivity.inputUri = messagingActivity.mediaFileResolver.createUriToSaveTakenPicture();
            if (MessagingActivity.this.permissionsHandler.checkPermission("android.permission.CAMERA")) {
                MessagingActivity.this.photoPicker.takePicture(MessagingActivity.this.inputUri);
            } else {
                MessagingActivity.this.permissionsHandler.requestPermission("android.permission.CAMERA", 1001);
            }
        }
    }

    /* renamed from: zendesk.classic.messaging.MessagingActivity$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements A {
        public AnonymousClass3() {
        }

        @Override // androidx.lifecycle.A
        public void onChanged(MessagingState messagingState) {
            MessagingView messagingView = MessagingActivity.this.messagingView;
            MessagingActivity messagingActivity = MessagingActivity.this;
            messagingView.renderState(messagingState, messagingActivity.messagingCellFactory, messagingActivity.picasso, messagingActivity.viewModel, messagingActivity.eventFactory);
        }
    }

    /* renamed from: zendesk.classic.messaging.MessagingActivity$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements A {
        public AnonymousClass4() {
        }

        @Override // androidx.lifecycle.A
        public void onChanged(Update.Action.Navigation navigation) {
            if (navigation != null) {
                navigation.navigate(MessagingActivity.this);
            }
        }
    }

    /* renamed from: zendesk.classic.messaging.MessagingActivity$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements A {
        public AnonymousClass5() {
        }

        @Override // androidx.lifecycle.A
        public void onChanged(Banner banner) {
            if (banner == null || banner.getPosition() != Banner.Position.BOTTOM) {
                return;
            }
            C1901g.hotel(MessagingActivity.this.findViewById(R.id.zui_recycler_view), banner.getLabel(), 0).juliet();
        }
    }

    /* renamed from: zendesk.classic.messaging.MessagingActivity$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements A {
        public AnonymousClass6() {
        }

        @Override // androidx.lifecycle.A
        public void onChanged(List<MenuItem> list) {
            MessagingActivity.this.invalidateOptionsMenu();
        }
    }

    public static MessagingConfiguration.Builder builder() {
        return new MessagingConfiguration.Builder();
    }

    private BottomSheetAttachmentAction createBottomSheetAttachmentActionCallback() {
        return new BottomSheetAttachmentAction() { // from class: zendesk.classic.messaging.MessagingActivity.2
            public AnonymousClass2() {
            }

            @Override // zendesk.commonui.BottomSheetAttachmentAction
            public void onSelectDocumentClicked() {
                MessagingActivity.this.photoPicker.selectDocument(MessagingActivity.INPUT_DOCUMENT_MIME_TYPES);
            }

            @Override // zendesk.commonui.BottomSheetAttachmentAction
            public void onSelectMediaClicked() {
                MessagingActivity.this.photoPicker.selectMedia();
            }

            @Override // zendesk.commonui.BottomSheetAttachmentAction
            public void onTakePhotoClicked() {
                MessagingActivity messagingActivity = MessagingActivity.this;
                messagingActivity.inputUri = messagingActivity.mediaFileResolver.createUriToSaveTakenPicture();
                if (MessagingActivity.this.permissionsHandler.checkPermission("android.permission.CAMERA")) {
                    MessagingActivity.this.photoPicker.takePicture(MessagingActivity.this.inputUri);
                } else {
                    MessagingActivity.this.permissionsHandler.requestPermission("android.permission.CAMERA", 1001);
                }
            }
        };
    }

    private BottomSheetAttachmentViewMenu createBottomSheetAttachmentMenu() {
        return new BottomSheetAttachmentViewMenu(this, Arrays.asList(getString(R.string.zui_label_camera_menu), getString(R.string.zui_label_gallery_menu), getString(R.string.zui_label_document_menu)), createBottomSheetAttachmentActionCallback());
    }

    public /* synthetic */ Uri lambda$onCreate$0() {
        return this.inputUri;
    }

    public /* synthetic */ void lambda$onRequestPermissionsResult$1(View view) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        MessagingViewModel messagingViewModel = this.viewModel;
        if (messagingViewModel != null) {
            messagingViewModel.onEvent(this.eventFactory.onActivityResult(i4, i5, intent));
        }
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i4 = 5;
        super.onCreate(bundle);
        if (bundle != null) {
            this.inputUri = (Uri) bundle.getParcelable(INPUT_URI);
        }
        getTheme().applyStyle(R.style.ZendeskActivityDefaultTheme, true);
        this.photoPicker = new PhotoPickerLifecycleObserver(getActivityResultRegistry(), this, new j(i4, this));
        getLifecycle().alpha(this.photoPicker);
        MessagingConfiguration messagingConfiguration = (MessagingConfiguration) new ConfigurationHelper().fromBundle(getIntent().getExtras(), MessagingConfiguration.class);
        if (messagingConfiguration == null) {
            Logger.e(LOG_TAG, "No configuration found. Please use MessagingActivity.builder()", new Object[0]);
            finish();
            return;
        }
        CacheFragment from = CacheFragment.from(this);
        MessagingComponent messagingComponent = (MessagingComponent) from.get(COMPONENT_KEY);
        if (messagingComponent == null) {
            List<Engine> engines = messagingConfiguration.getEngines();
            if (CollectionUtils.isEmpty(engines)) {
                Logger.e(LOG_TAG, NO_ENGINES_ERROR_LOG, new Object[0]);
                finish();
                return;
            } else {
                messagingComponent = DaggerMessagingComponent.builder().appContext(getApplicationContext()).engines(engines).messagingConfiguration(messagingConfiguration).build();
                messagingComponent.messagingViewModel().start();
                from.put(COMPONENT_KEY, messagingComponent);
            }
        }
        DaggerMessagingActivityComponent.builder().messagingComponent(messagingComponent).activity(this).build().inject(this);
        setContentView(R.layout.zui_activity_messaging);
        this.messagingView = (MessagingView) findViewById(R.id.zui_view_messaging);
        Toolbar toolbar = (Toolbar) findViewById(R.id.zui_toolbar);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar_messaging);
        InsetType insetType = InsetType.TOP;
        InsetType insetType2 = InsetType.HORIZONTAL;
        SystemWindowInsets.applyWindowInsets(appBarLayout, insetType, insetType2);
        SystemWindowInsets.applyWindowInsets(this.messagingView.findViewById(R.id.zui_recycler_view_layout), insetType, insetType2);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.MessagingActivity.1
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MessagingActivity.this.finish();
            }
        });
        toolbar.setTitle(messagingConfiguration.getToolbarTitle(getResources()));
        InputBox inputBox = (InputBox) findViewById(R.id.zui_input_box);
        SystemWindowInsets.applyWindowInsets(inputBox, InsetType.BOTTOM);
        au counterLiveData = this.viewModel.getCounterLiveData();
        Objects.requireNonNull(inputBox);
        counterLiveData.observe(this, new C0211t(5, inputBox));
        this.messagingComposer.bind(inputBox, createBottomSheetAttachmentMenu());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.viewModel == null) {
            return false;
        }
        menu.clear();
        List<MenuItem> list = (List) this.viewModel.getLiveMenuItems().getValue();
        if (CollectionUtils.isEmpty(list)) {
            Logger.d(LOG_TAG, "Menu: no items, hiding...", new Object[0]);
            return false;
        }
        for (MenuItem menuItem : list) {
            menu.add(0, menuItem.getItemId(), 0, menuItem.getLabelId());
        }
        Logger.d(LOG_TAG, "Menu: items updated.", new Object[0]);
        return true;
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        if (this.viewModel != null) {
            Logger.d(LOG_TAG, "onDestroy() called, clearing...", new Object[0]);
            this.viewModel.onCleared();
        }
        getLifecycle().charlie(this.photoPicker);
    }

    @Override // zendesk.commonui.PhotoPickerSelectionCallback
    public void onMediaSelected(List<Uri> list) {
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            this.mediaHolder.add(it.next());
        }
        this.viewModel.setCounterValue(list.size());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        super.onOptionsItemSelected(menuItem);
        this.viewModel.onEvent(this.eventFactory.menuItemClicked(menuItem.getItemId()));
        return true;
    }

    @Override // zendesk.commonui.PhotoPickerSelectionCallback
    public void onPhotoTaken(Uri uri) {
        this.mediaHolder.add(uri);
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 == 1001) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.photoPicker.takePicture(this.inputUri);
                return;
            }
            C1901g golf = C1901g.golf(findViewById(R.id.zui_recycler_view), R.string.zui_camera_permission_denied, 0);
            golf.india(getString(R.string.zui_camera_permission_denied_settings), new a(27, this));
            golf.juliet();
        }
    }

    @Override // ae.o, f1.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable(INPUT_URI, this.inputUri);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onStart() {
        super.onStart();
        MessagingViewModel messagingViewModel = this.viewModel;
        if (messagingViewModel != null) {
            messagingViewModel.getLiveMessagingState().observe(this, new A() { // from class: zendesk.classic.messaging.MessagingActivity.3
                public AnonymousClass3() {
                }

                @Override // androidx.lifecycle.A
                public void onChanged(MessagingState messagingState) {
                    MessagingView messagingView = MessagingActivity.this.messagingView;
                    MessagingActivity messagingActivity = MessagingActivity.this;
                    messagingView.renderState(messagingState, messagingActivity.messagingCellFactory, messagingActivity.picasso, messagingActivity.viewModel, messagingActivity.eventFactory);
                }
            });
            this.viewModel.getLiveNavigationStream().observe(this, new A() { // from class: zendesk.classic.messaging.MessagingActivity.4
                public AnonymousClass4() {
                }

                @Override // androidx.lifecycle.A
                public void onChanged(Update.Action.Navigation navigation) {
                    if (navigation != null) {
                        navigation.navigate(MessagingActivity.this);
                    }
                }
            });
            this.viewModel.getLiveInterfaceUpdateItems().observe(this, new A() { // from class: zendesk.classic.messaging.MessagingActivity.5
                public AnonymousClass5() {
                }

                @Override // androidx.lifecycle.A
                public void onChanged(Banner banner) {
                    if (banner == null || banner.getPosition() != Banner.Position.BOTTOM) {
                        return;
                    }
                    C1901g.hotel(MessagingActivity.this.findViewById(R.id.zui_recycler_view), banner.getLabel(), 0).juliet();
                }
            });
            this.viewModel.getLiveMenuItems().observe(this, new A() { // from class: zendesk.classic.messaging.MessagingActivity.6
                public AnonymousClass6() {
                }

                @Override // androidx.lifecycle.A
                public void onChanged(List<MenuItem> list) {
                    MessagingActivity.this.invalidateOptionsMenu();
                }
            });
            this.viewModel.getDialogUpdates().observe(this, this.messagingDialog);
        }
    }
}
