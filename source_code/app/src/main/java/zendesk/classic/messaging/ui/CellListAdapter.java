package zendesk.classic.messaging.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0677w;
import androidx.recyclerview.widget.aq;
import androidx.recyclerview.widget.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellListAdapter extends aq {

    /* loaded from: classes.dex */
    public static class CellDiffUtil extends AbstractC0677w {
        @Override // androidx.recyclerview.widget.AbstractC0677w
        public boolean areContentsTheSame(MessagingCell messagingCell, MessagingCell messagingCell2) {
            return messagingCell.areContentsTheSame(messagingCell2);
        }

        @Override // androidx.recyclerview.widget.AbstractC0677w
        public boolean areItemsTheSame(MessagingCell messagingCell, MessagingCell messagingCell2) {
            if (messagingCell.getId().equals(MessagingCellFactory.TYPING_INDICATOR_ID)) {
                return false;
            }
            return messagingCell.getId().equals(messagingCell2.getId());
        }
    }

    public CellListAdapter() {
        super(new CellDiffUtil());
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemViewType(int i4) {
        return ((MessagingCell) getItem(i4)).getLayoutRes();
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(f0 f0Var, int i4) {
        MessagingCell messagingCell = (MessagingCell) getItem(i4);
        View view = f0Var.itemView;
        if (messagingCell.getViewClassType().isInstance(view)) {
            messagingCell.bind(view);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public f0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new f0(LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false)) { // from class: zendesk.classic.messaging.ui.CellListAdapter.1
        };
    }
}
