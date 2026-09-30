package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.aa;
import androidx.recyclerview.widget.r;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import i7.C1901g;
import java.util.List;
import v2.j;
import x2.C3286g;
import x2.C3293n;
import x2.ad;
import x2.aw;
import zendesk.commonui.InsetType;
import zendesk.commonui.SystemWindowInsets;
import zendesk.support.R;
import zendesk.support.UiUtils;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.request.ViewAlmostRealProgressBar;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class RequestListView extends FrameLayout {
    private static final String IS_SHOWING_SNACKBAR_KEY = "is_showing_snackbar";
    private static final String REQUEST_LIST_VIEW_SUPERSTATE_KEY = "request_list_view_superstate";
    private final i activity;
    private final RequestListAdapter adapter;
    private final RequestListConfiguration config;
    private final FloatingActionButton createTicketFab;
    private final C3293n emptyScene;
    private final C3286g fade;
    private boolean isLoading;
    private boolean isStopped;
    private OnItemClick itemClickListener;
    private final C3293n listScene;
    private final View listSceneView;
    private final View logoImage;
    private final View logoImageEmpty;
    private final ViewAlmostRealProgressBar progressBar;
    private final RecyclerView recyclerView;
    private View.OnClickListener retryClickListener;
    private final ViewGroup rootLayout;
    private final ViewGroup sceneRoot;
    private SceneState sceneState;
    C1901g snackbar;
    private final View startConversationButton;
    private final SwipeRefreshLayout swipeRefreshLayout;
    private final SwipeRefreshLayout swipeRefreshLayoutEmpty;
    private final Toolbar toolbar;

    /* loaded from: classes.dex */
    public interface OnItemClick {
        void onClick(RequestListItem requestListItem);
    }

    /* loaded from: classes.dex */
    public enum SceneState {
        LIST,
        EMPTY,
        NONE
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [x2.g, x2.aw] */
    public RequestListView(i iVar, RequestListConfiguration requestListConfiguration, Picasso picasso) {
        super(iVar);
        this.sceneState = SceneState.NONE;
        this.itemClickListener = null;
        this.retryClickListener = null;
        this.isLoading = false;
        this.isStopped = true;
        this.fade = new aw();
        this.activity = iVar;
        this.config = requestListConfiguration;
        setId(R.id.request_list_view);
        View.inflate(iVar, R.layout.zs_activity_request_list, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.request_list_scene_root);
        this.sceneRoot = viewGroup;
        LayoutInflater from = LayoutInflater.from(iVar);
        View inflate = from.inflate(R.layout.zs_activity_request_list_scene_data, viewGroup, false);
        this.listSceneView = inflate;
        View inflate2 = from.inflate(R.layout.zs_activity_request_list_scene_empty, viewGroup, false);
        this.listScene = new C3293n(viewGroup, inflate);
        this.emptyScene = new C3293n(viewGroup, inflate2);
        this.progressBar = (ViewAlmostRealProgressBar) findViewById(R.id.request_list_progressBar);
        this.toolbar = (Toolbar) findViewById(R.id.request_list_toolbar);
        this.rootLayout = (ViewGroup) findViewById(R.id.request_list_coordinator_layout);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.request_list_create_new_ticket_fab);
        this.createTicketFab = floatingActionButton;
        this.logoImage = inflate.findViewById(R.id.request_list_zendesk_logo);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.request_list_recycler);
        this.recyclerView = recyclerView;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.request_list_swipe_refresh_layout);
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.startConversationButton = inflate2.findViewById(R.id.request_list_empty_start_conversation);
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) inflate2.findViewById(R.id.request_list_swipe_refresh_layout_empty);
        this.swipeRefreshLayoutEmpty = swipeRefreshLayout2;
        this.logoImageEmpty = inflate2.findViewById(R.id.request_list_zendesk_logo_empty);
        RequestListAdapter requestListAdapter = new RequestListAdapter(new OnItemClick() { // from class: zendesk.support.requestlist.RequestListView.1
            @Override // zendesk.support.requestlist.RequestListView.OnItemClick
            public void onClick(RequestListItem requestListItem) {
                if (RequestListView.this.itemClickListener != null) {
                    RequestListView.this.itemClickListener.onClick(requestListItem);
                }
            }
        }, picasso);
        this.adapter = requestListAdapter;
        recyclerView.setAdapter(requestListAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.addItemDecoration(new aa(iVar));
        recyclerView.setItemAnimator(new r());
        floatingActionButton.delta(true);
        View findViewById = findViewById(R.id.request_list_compat_shadow);
        ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        int themeAttributeToColor = UiUtils.themeAttributeToColor(R.attr.colorAccent, getContext(), R.color.zs_color_black);
        swipeRefreshLayout.setColorSchemeColors(themeAttributeToColor);
        swipeRefreshLayout2.setColorSchemeColors(themeAttributeToColor);
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        SystemWindowInsets.applyWindowInsets((AppBarLayout) findViewById(R.id.appbar_request_list), InsetType.TOP);
        SystemWindowInsets.applyWindowInsets(this.toolbar, InsetType.HORIZONTAL);
        SystemWindowInsets.applyWindowInsets(this.sceneRoot, InsetType.BOTTOM);
    }

    private void dismissSnackbar() {
        C1901g c1901g = this.snackbar;
        if (c1901g != null) {
            c1901g.alpha(3);
        }
        this.snackbar = null;
    }

    private boolean isShowingSnackBar() {
        C1901g c1901g = this.snackbar;
        if (c1901g != null && c1901g.bravo()) {
            return true;
        }
        return false;
    }

    public void announceAccessibility(int i4) {
        announceForAccessibility(getResources().getString(i4));
    }

    public void finish(String str) {
        if (StringUtils.hasLength(str)) {
            Logger.d("RequestListActivity", str, new Object[0]);
        }
        finish();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            boolean z2 = bundle.getBoolean(IS_SHOWING_SNACKBAR_KEY);
            parcelable = bundle.getParcelable(REQUEST_LIST_VIEW_SUPERSTATE_KEY);
            if (z2) {
                showErrorMessage();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(REQUEST_LIST_VIEW_SUPERSTATE_KEY, super.onSaveInstanceState());
        bundle.putBoolean(IS_SHOWING_SNACKBAR_KEY, isShowingSnackBar());
        return bundle;
    }

    public void onStart() {
        this.isStopped = false;
    }

    public void onStop() {
        this.isStopped = true;
        dismissSnackbar();
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        this.toolbar.setNavigationOnClickListener(onClickListener);
    }

    public void setCreateRequestListener(View.OnClickListener onClickListener) {
        this.createTicketFab.setOnClickListener(onClickListener);
        this.startConversationButton.setOnClickListener(onClickListener);
    }

    public void setItemClickListener(OnItemClick onItemClick) {
        this.itemClickListener = onItemClick;
    }

    public void setLoading(boolean z2) {
        dismissSnackbar();
        if (this.isLoading != z2) {
            if (z2) {
                if (!this.swipeRefreshLayout.red && !this.swipeRefreshLayoutEmpty.red) {
                    announceAccessibility(R.string.zs_request_list_content_loading_accessibility);
                    this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
                if (!swipeRefreshLayout.red && !this.swipeRefreshLayoutEmpty.red) {
                    this.progressBar.stop(300L);
                } else {
                    swipeRefreshLayout.setRefreshing(false);
                    this.swipeRefreshLayoutEmpty.setRefreshing(false);
                }
            }
        }
        this.isLoading = z2;
    }

    public void setLogoClickListener(boolean z2, View.OnClickListener onClickListener) {
        int i4;
        if (z2) {
            i4 = 0;
        } else {
            i4 = 4;
            onClickListener = null;
        }
        this.logoImage.setVisibility(i4);
        this.logoImageEmpty.setVisibility(i4);
        this.logoImage.setOnClickListener(onClickListener);
        this.logoImageEmpty.setOnClickListener(onClickListener);
    }

    public void setRetryClickListener(View.OnClickListener onClickListener) {
        this.retryClickListener = onClickListener;
    }

    public void setSwipeRefreshListener(j jVar) {
        this.swipeRefreshLayout.setOnRefreshListener(jVar);
        this.swipeRefreshLayoutEmpty.setOnRefreshListener(jVar);
    }

    public void showErrorMessage() {
        if (!this.isStopped && !isShowingSnackBar()) {
            announceAccessibility(R.string.zs_request_list_content_load_failed_accessibility);
            C1901g golf = C1901g.golf(this.rootLayout, R.string.request_list_error_message, -2);
            int i4 = R.string.zendesk_retry_button_label;
            golf.india(golf.hotel.getText(i4), this.retryClickListener);
            this.snackbar = golf;
            golf.juliet();
        }
    }

    public void showRequestList(List<RequestListItem> list) {
        dismissSnackbar();
        this.progressBar.stop(300L);
        if (CollectionUtils.isEmpty(list)) {
            SceneState sceneState = this.sceneState;
            SceneState sceneState2 = SceneState.EMPTY;
            if (sceneState != sceneState2) {
                this.createTicketFab.delta(true);
                ad.charlie(this.emptyScene, this.fade);
                announceAccessibility(R.string.zs_request_list_content_loaded_empty_accessibility);
                this.sceneState = sceneState2;
                return;
            }
            return;
        }
        this.adapter.swapRequests(list);
        this.progressBar.stop(300L);
        SceneState sceneState3 = this.sceneState;
        SceneState sceneState4 = SceneState.LIST;
        if (sceneState3 != sceneState4) {
            if (this.config.isContactUsButtonVisible()) {
                this.createTicketFab.foxtrot(true);
            } else {
                this.createTicketFab.delta(true);
            }
            if (this.listSceneView.getParent() == null) {
                ad.charlie(this.listScene, this.fade);
            }
            announceAccessibility(R.string.zs_request_list_content_loaded_accessibility);
            this.sceneState = sceneState4;
        }
    }

    public void startReferrerPage(String str) {
        this.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void startRequestActivity(RequestConfiguration.Builder builder) {
        builder.show(this.activity, this.config.getConfigurations());
    }

    public void finish() {
        if (this.activity.isFinishing()) {
            return;
        }
        this.activity.finish();
    }
}
