package zendesk.support.request;

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
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zendesk.commonui.BottomSheetAttachmentViewMenu;
import zendesk.support.R;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;

/* loaded from: classes.dex */
public class RequestViewConversationsDisabled extends FrameLayout implements RequestView {
    ActionFactory actionFactory;
    private i activity;
    private AttachmentHelper attachmentHelper;
    BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu;
    private ComponentInputForm inputFormComponent;
    MediaResultUtility mediaResultUtility;
    private List<MenuItemsDelegate> menuItemsDelegates;
    Picasso picasso;
    Store store;
    private Subscription subscription;

    /* loaded from: classes.dex */
    public interface MenuItemsDelegate {
        void onMenuItemsClicked(MenuItem menuItem);

        void onMenuItemsInflated(MenuItem menuItem, MenuItem menuItem2);
    }

    public RequestViewConversationsDisabled(Context context) {
        super(context);
        this.menuItemsDelegates = new ArrayList();
        viewInit(context);
    }

    private Subscription bindAttachmentCarousel(Store store, ActionFactory actionFactory) {
        RecyclerView recyclerView = (RecyclerView) this.activity.findViewById(R.id.request_attachment_carousel);
        AdapterAttachmentCarousel adapterAttachmentCarousel = new AdapterAttachmentCarousel(this.attachmentHelper, this.picasso, actionFactory, store, this.mediaResultUtility);
        ComponentAttachmentCarousel componentAttachmentCarousel = new ComponentAttachmentCarousel(this.activity, this.attachmentHelper, recyclerView, this.bottomSheetAttachmentViewMenu);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(adapterAttachmentCarousel);
        this.menuItemsDelegates.add(componentAttachmentCarousel);
        return store.addListener(componentAttachmentCarousel.getSelector(), componentAttachmentCarousel);
    }

    private Subscription bindComponents(Store store, ActionFactory actionFactory) {
        return CombinedSubscription.from(bindInput(store), bindAttachmentCarousel(store, actionFactory));
    }

    private Subscription bindInput(Store store) {
        ComponentInputForm create = ComponentInputForm.create(this, store, this.actionFactory, this.attachmentHelper);
        this.inputFormComponent = create;
        this.menuItemsDelegates.add(create);
        return store.addListener(this.inputFormComponent.getSelector(), this.inputFormComponent);
    }

    private void viewInit(Context context) {
        View.inflate(context, R.layout.zs_view_request_conversations_disabled, this);
        this.activity = (i) context;
    }

    @Override // zendesk.support.request.RequestView
    public boolean hasUnsavedInput() {
        ComponentInputForm componentInputForm = this.inputFormComponent;
        if (componentInputForm != null && componentInputForm.hasUnsavedInput()) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.request.RequestView
    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        menuInflater.inflate(R.menu.zs_view_request_conversations_disabled_menu, menu);
        MenuItem findItem = menu.findItem(R.id.request_conversations_disabled_menu_ic_send);
        MenuItem findItem2 = menu.findItem(R.id.request_conversations_disabled_menu_ic_add_attachments);
        Iterator<MenuItemsDelegate> it = this.menuItemsDelegates.iterator();
        while (it.hasNext()) {
            it.next().onMenuItemsInflated(findItem, findItem2);
        }
        return true;
    }

    public void init(RequestComponent requestComponent, BottomSheetAttachmentViewMenu bottomSheetAttachmentViewMenu) {
        requestComponent.inject(this);
        this.attachmentHelper = new AttachmentHelper(new int[0]);
        this.bottomSheetAttachmentViewMenu = bottomSheetAttachmentViewMenu;
        Subscription bindComponents = bindComponents(this.store, this.actionFactory);
        this.subscription = bindComponents;
        bindComponents.informWithCurrentState();
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
        Iterator<MenuItemsDelegate> it = this.menuItemsDelegates.iterator();
        while (it.hasNext()) {
            it.next().onMenuItemsClicked(menuItem);
        }
        return true;
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.menuItemsDelegates = new ArrayList();
        viewInit(context);
    }

    public RequestViewConversationsDisabled(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.menuItemsDelegates = new ArrayList();
        viewInit(context);
    }
}
