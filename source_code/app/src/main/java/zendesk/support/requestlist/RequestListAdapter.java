package zendesk.support.requestlist;

import android.view.ViewGroup;
import androidx.recyclerview.widget.az;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.requestlist.RequestListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestListAdapter extends az {
    private final RequestListView.OnItemClick itemClickListener;
    private final Picasso picasso;
    private final List<RequestListItem> requestListItems = new ArrayList(0);

    public RequestListAdapter(RequestListView.OnItemClick onItemClick, Picasso picasso) {
        this.itemClickListener = onItemClick;
        this.picasso = picasso;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        return this.requestListItems.size();
    }

    @Override // androidx.recyclerview.widget.az
    public long getItemId(int i4) {
        return this.requestListItems.get(i4).getItemId();
    }

    public void swapRequests(List<RequestListItem> list) {
        this.requestListItems.clear();
        this.requestListItems.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(RequestListViewHolder requestListViewHolder, int i4) {
        requestListViewHolder.bind(this.requestListItems.get(i4));
    }

    @Override // androidx.recyclerview.widget.az
    public RequestListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return RequestListViewHolder.create(viewGroup.getContext(), viewGroup, this.itemClickListener, this.picasso);
    }
}
