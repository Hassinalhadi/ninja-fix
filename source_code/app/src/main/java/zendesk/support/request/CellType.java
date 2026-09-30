package zendesk.support.request;

import android.graphics.Rect;
import java.util.Date;
import java.util.List;
import zendesk.support.request.ComponentRequestAdapter;

/* loaded from: classes.dex */
interface CellType {

    /* loaded from: classes.dex */
    public interface Agent extends Base {
        StateRequestUser getAgent();

        boolean isAgentNameVisible();

        void showAgentName(boolean z2);
    }

    /* loaded from: classes.dex */
    public interface Attachment extends Base {
        StateRequestAttachment getAttachment();
    }

    /* loaded from: classes.dex */
    public interface Base {
        boolean areContentsTheSame(Base base);

        void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder);

        long getGroupId();

        Rect getInsets();

        int getLayoutId();

        int getPositionType();

        Date getTimeStamp();

        long getUniqueId();

        void setPositionType(int i4);
    }

    /* loaded from: classes.dex */
    public interface Message extends Base {
        CharSequence getMessage();
    }

    /* loaded from: classes.dex */
    public interface Stateful extends Base {
        List<StateMessage> getErrorGroupMessages();

        StateMessage getStateMessage();

        boolean isErrorShown();

        boolean isLastErrorCellOfBlock();

        boolean isMarkedAsDelivered();

        Stateful markAsDelivered();

        Stateful markAsErrored(List<StateMessage> list, boolean z2);
    }
}
