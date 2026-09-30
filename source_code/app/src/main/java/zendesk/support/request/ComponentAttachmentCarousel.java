package zendesk.support.request;

import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.app.i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.support.R;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentAttachmentCarousel implements Listener<AttachmentCarouselModel>, RequestViewConversationsDisabled.MenuItemsDelegate {
    private MenuItem attachmentButton;
    private final AttachmentHelper attachmentHelper;
    private final BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu;
    private final RecyclerView recyclerView;
    private final ScrollView scrollView;
    private boolean attachmentSupportEnabled = false;
    private final StateSelector<AttachmentCarouselModel> selector = new AttachmentCarouselSelector();

    /* loaded from: classes.dex */
    public static class AttachmentCarouselModel {
        private final Collection<StateRequestAttachment> additionalAttachments;
        private final boolean isAttachmentSupportEnabled;
        private final boolean isLoading;
        private final long maxAttachmentSize;
        private final Collection<StateRequestAttachment> selectedAttachments;

        public AttachmentCarouselModel(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2, boolean z2, boolean z10, long j5) {
            this.selectedAttachments = collection;
            this.additionalAttachments = collection2;
            this.isLoading = z2;
            this.isAttachmentSupportEnabled = z10;
            this.maxAttachmentSize = j5;
        }

        public Collection<StateRequestAttachment> getAdditionalAttachments() {
            return this.additionalAttachments;
        }

        public long getMaxAttachmentSize() {
            return this.maxAttachmentSize;
        }

        public Collection<StateRequestAttachment> getSelectedAttachments() {
            return this.selectedAttachments;
        }

        public boolean isAttachmentSupportEnabled() {
            return this.isAttachmentSupportEnabled;
        }

        public boolean isLoading() {
            return this.isLoading;
        }
    }

    /* loaded from: classes.dex */
    public static class AttachmentCarouselSelector implements StateSelector<AttachmentCarouselModel> {
        @Override // zendesk.support.suas.StateSelector
        public AttachmentCarouselModel selectData(State state) {
            StateAttachments fromState = StateAttachments.fromState(state);
            StateConfig fromState2 = StateConfig.fromState(state);
            return new AttachmentCarouselModel(fromState.getSelectedAttachments(), fromState.getAllSelectedAttachments(), StateProgress.fomState(state).getRunningRequests() > 0, fromState2.getSettings().isAttachmentsEnabled(), fromState2.getSettings().getMaxAttachmentSize());
        }
    }

    public ComponentAttachmentCarousel(i iVar, AttachmentHelper attachmentHelper, RecyclerView recyclerView, BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        this.attachmentHelper = attachmentHelper;
        this.recyclerView = recyclerView;
        this.scrollView = (ScrollView) iVar.findViewById(R.id.request_conversations_disabled_scrollview);
        this.bottomSheetAttachmentViewMenu = bottomSheetAttachmentViewMenu;
    }

    private void attachmentButtonVisibility(boolean z2, boolean z10) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            menuItem.setVisible(z2);
            this.attachmentButton.getActionView().setEnabled(z10);
        }
    }

    private void attachmentCount(int i4) {
        MenuItem menuItem = this.attachmentButton;
        if (menuItem != null) {
            ((ViewCellAttachmentMenuItem) menuItem.getActionView()).setBadgeCount(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAddAttachmentsRequested() {
        this.bottomSheetAttachmentViewMenu.showMenu();
    }

    private void scroll(final int i4) {
        this.scrollView.post(new Runnable() { // from class: zendesk.support.request.ComponentAttachmentCarousel.1
            @Override // java.lang.Runnable
            public void run() {
                ComponentAttachmentCarousel.this.scrollView.fullScroll(i4);
            }
        });
    }

    public StateSelector<AttachmentCarouselModel> getSelector() {
        return this.selector;
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsClicked(MenuItem menuItem) {
    }

    @Override // zendesk.support.request.RequestViewConversationsDisabled.MenuItemsDelegate
    public void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2) {
        this.attachmentButton = menuItem2;
        menuItem2.getActionView().setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.ComponentAttachmentCarousel.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ComponentAttachmentCarousel.this.onAddAttachmentsRequested();
            }
        });
        attachmentButtonVisibility(this.attachmentSupportEnabled, true);
    }

    @Override // zendesk.support.suas.Listener
    public void update(AttachmentCarouselModel attachmentCarouselModel) {
        boolean isAttachmentSupportEnabled = attachmentCarouselModel.isAttachmentSupportEnabled();
        this.attachmentSupportEnabled = isAttachmentSupportEnabled;
        attachmentButtonVisibility(isAttachmentSupportEnabled, !attachmentCarouselModel.isLoading());
        if (attachmentCarouselModel.isLoading()) {
            return;
        }
        this.attachmentHelper.updateAttachments(attachmentCarouselModel.getSelectedAttachments());
        this.attachmentHelper.updateMaxFileSize(attachmentCarouselModel.getMaxAttachmentSize());
        attachmentCount(this.attachmentHelper.getSelectedAttachments().size());
        if (this.attachmentHelper.getSelectedAttachments().size() > 0) {
            scroll(130);
        } else {
            scroll(33);
        }
        this.recyclerView.getAdapter().notifyDataSetChanged();
    }
}
