package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ao;
import androidx.recyclerview.widget.ar;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.r;
import com.squareup.picasso.Picasso;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.commonui.InsetType;
import zendesk.commonui.SystemWindowInsets;
import zendesk.support.R;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;
import zendesk.support.request.ViewMessageComposer;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class RequestViewConversationsEnabled extends FrameLayout implements RequestView {
    ActionFactory actionFactory;
    private i activity;
    private BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu;
    CellFactory cellFactory;
    private ComponentMessageComposer messageComposerComponent;
    private ViewMessageComposer messageComposerView;
    Picasso picasso;
    private RecyclerView recyclerView;
    Store store;
    private Subscription subscription;
    private View toolbar;
    private View toolbarContainer;

    /* loaded from: classes.dex */
    public static class RecyclerListener implements ViewMessageComposer.OnHeightChangeListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, ar {
        private static final int FIXED_SCROLL_TIME = 50;
        private static final int SCROLL_INSTANT = 1;
        private static final int SCROLL_SMOOTH_FIXED_TIME = 3;
        private static final int SCROLL_SMOOTH_FIXED_VELOCITY = 2;
        private final LinearLayoutManager linearLayoutManager;
        private final int recyclerDefaultBottomPadding;
        private final RecyclerView recyclerView;

        public RecyclerListener(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.recyclerView = recyclerView;
            this.linearLayoutManager = linearLayoutManager;
            this.recyclerDefaultBottomPadding = recyclerView.getResources().getDimensionPixelOffset(R.dimen.zs_request_recycler_padding_bottom);
        }

        private void postScrollToBottom(final int i4) {
            this.recyclerView.post(new Runnable() { // from class: zendesk.support.request.RequestViewConversationsEnabled.RecyclerListener.3
                @Override // java.lang.Runnable
                public void run() {
                    RecyclerListener.this.scrollToBottom(i4);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void scrollToBottom(int i4) {
            int i5;
            View view;
            int itemCount = this.recyclerView.getAdapter().getItemCount() - 1;
            if (itemCount >= 0) {
                if (i4 == 1) {
                    f0 findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(itemCount);
                    if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                        i5 = view.getHeight();
                    } else {
                        i5 = 0;
                    }
                    int paddingBottom = (this.recyclerView.getPaddingBottom() + i5) * (-1);
                    LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
                    linearLayoutManager.xray = itemCount;
                    linearLayoutManager.yankee = paddingBottom;
                    LinearLayoutManager.SavedState savedState = linearLayoutManager.zulu;
                    if (savedState != null) {
                        savedState.alpha = -1;
                    }
                    linearLayoutManager.l();
                    return;
                }
                if (i4 == 3) {
                    ao aoVar = new ao(this.recyclerView.getContext()) { // from class: zendesk.support.request.RequestViewConversationsEnabled.RecyclerListener.2
                        @Override // androidx.recyclerview.widget.ao
                        public int calculateTimeForScrolling(int i10) {
                            return 50;
                        }
                    };
                    aoVar.setTargetPosition(itemCount);
                    this.recyclerView.getLayoutManager().y(aoVar);
                } else if (i4 == 2) {
                    ao aoVar2 = new ao(this.recyclerView.getContext());
                    aoVar2.setTargetPosition(itemCount);
                    this.recyclerView.getLayoutManager().y(aoVar2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ar
        public void onChanged(int i4, int i5, Object obj) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i4, i5, obj);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            if (z2) {
                postScrollToBottom(2);
            }
        }

        @Override // zendesk.support.request.ViewMessageComposer.OnHeightChangeListener
        public void onHeightChange(final int i4) {
            this.recyclerView.post(new Runnable() { // from class: zendesk.support.request.RequestViewConversationsEnabled.RecyclerListener.1
                @Override // java.lang.Runnable
                public void run() {
                    int paddingLeft = RecyclerListener.this.recyclerView.getPaddingLeft();
                    int paddingRight = RecyclerListener.this.recyclerView.getPaddingRight();
                    int paddingTop = RecyclerListener.this.recyclerView.getPaddingTop();
                    int i5 = RecyclerListener.this.recyclerDefaultBottomPadding;
                    int i10 = i4;
                    if (i10 > 0) {
                        i5 += i10;
                    }
                    if (i5 != RecyclerListener.this.recyclerView.getPaddingBottom()) {
                        RecyclerListener.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, i5);
                        RecyclerListener.this.scrollToBottom(1);
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.ar
        public void onInserted(int i4, int i5) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i4, i5);
            postScrollToBottom(3);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
            if (i11 < i15) {
                postScrollToBottom(1);
            }
        }

        @Override // androidx.recyclerview.widget.ar
        public void onMoved(int i4, int i5) {
            this.recyclerView.getAdapter().notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.ar
        public void onRemoved(int i4, int i5) {
            this.recyclerView.getAdapter().notifyItemRangeRemoved(i4, i5);
        }
    }

    /* loaded from: classes.dex */
    public static class RequestItemAnimator extends r {
        private final ComponentRequestAdapter component;

        public RequestItemAnimator(ComponentRequestAdapter componentRequestAdapter) {
            this.component = componentRequestAdapter;
            setSupportsChangeAnimations(false);
        }

        @Override // androidx.recyclerview.widget.i0
        public boolean canReuseUpdatedViewHolder(f0 f0Var) {
            if (this.component.getMessageForPos(f0Var.getAdapterPosition()) instanceof CellType.Attachment) {
                return true;
            }
            return super.canReuseUpdatedViewHolder(f0Var);
        }
    }

    public RequestViewConversationsEnabled(Context context) {
        super(context);
        viewInit(context);
    }

    private void applyWindowInsets() {
        SystemWindowInsets.applyWindowInsets(this.recyclerView, InsetType.HORIZONTAL);
    }

    private Subscription bindComponents(Store store) {
        return CombinedSubscription.from(bindMessageComposer(store), bindRecycler(store), bindDialogComponent(store));
    }

    private Subscription bindDialogComponent(Store store) {
        return store.addListener(StateUi.class, new ComponentDialog(this.activity, this.actionFactory, store));
    }

    private Subscription bindMessageComposer(Store store) {
        ComponentMessageComposer componentMessageComposer = new ComponentMessageComposer(this.messageComposerView, store, this.actionFactory, this.bottomSheetAttachmentViewMenu);
        this.messageComposerComponent = componentMessageComposer;
        return store.addListener(componentMessageComposer.getSelector(), this.messageComposerComponent);
    }

    private Subscription bindRecycler(Store store) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerListener recyclerListener = new RecyclerListener(this.recyclerView, linearLayoutManager);
        ComponentRequestAdapter componentRequestAdapter = new ComponentRequestAdapter(recyclerListener, this.cellFactory, this.recyclerView);
        CellMarginDecorator cellMarginDecorator = new CellMarginDecorator(componentRequestAdapter, this.activity);
        RequestItemAnimator requestItemAnimator = new RequestItemAnimator(componentRequestAdapter);
        ComponentRequestAdapter.RequestAdapter requestAdapter = new ComponentRequestAdapter.RequestAdapter(componentRequestAdapter);
        this.recyclerView.setItemAnimator(requestItemAnimator);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.addItemDecoration(cellMarginDecorator);
        this.recyclerView.setAdapter(requestAdapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.messageComposerView.setOnHeightChangeListener(recyclerListener);
        this.messageComposerView.addOnFocusChangeListener(recyclerListener);
        this.recyclerView.addOnLayoutChangeListener(recyclerListener);
        return store.addListener(componentRequestAdapter.getSelector(), componentRequestAdapter);
    }

    private void bindViews() {
        this.recyclerView = (RecyclerView) findViewById(R.id.activity_request_recycler_view);
        this.messageComposerView = (ViewMessageComposer) findViewById(R.id.activity_request_message_composer);
        this.toolbarContainer = this.activity.findViewById(R.id.activity_request_appbar);
        this.toolbar = this.activity.findViewById(R.id.activity_request_toolbar);
        applyWindowInsets();
        this.messageComposerView.init();
    }

    private void viewInit(Context context) {
        View.inflate(context, R.layout.zs_view_request_conversations_enabled, this);
        this.activity = (i) context;
    }

    @Override // zendesk.support.request.RequestView
    public boolean hasUnsavedInput() {
        ComponentMessageComposer componentMessageComposer = this.messageComposerComponent;
        if (componentMessageComposer != null && componentMessageComposer.hasUnsavedInput()) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.RequestView
    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    public void init(RequestComponent requestComponent, boolean z2, BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        requestComponent.inject(this);
        bindViews();
        this.bottomSheetAttachmentViewMenu = bottomSheetAttachmentViewMenu;
        Subscription bindComponents = bindComponents(this.store);
        this.subscription = bindComponents;
        bindComponents.informWithCurrentState();
        if (z2) {
            this.store.dispatch(this.actionFactory.loadCommentsFromCacheAsync());
            this.store.dispatch(this.actionFactory.loadRequestAsync());
            this.store.dispatch(this.actionFactory.initialLoadCommentsAsync());
            this.messageComposerView.requestFocusForInput();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription = this.subscription;
        if (subscription != null) {
            subscription.removeListener();
        }
    }

    @Override // zendesk.support.request.RequestView
    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        viewInit(context);
    }
}
