package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import zendesk.support.R;
import zendesk.support.RequestStatus;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

/* loaded from: classes.dex */
class CellSystemMessages {

    /* loaded from: classes.dex */
    public static class CellDateMessage extends CellBase {
        public CellDateMessage(CellBindHelper cellBindHelper, long j5, Date date) {
            super(cellBindHelper, R.layout.zs_request_date_message, j5, -2147483648L, date);
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public boolean areContentsTheSame(CellType.Base base) {
            return getTimeStamp().equals(base.getTimeStamp());
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            this.utils.bindDate((TextView) requestViewHolder.findCachedView(R.id.request_date_message_text), getTimeStamp());
        }
    }

    /* loaded from: classes.dex */
    public static class CellRequestStatus extends CellBase {
        private final RequestStatus requestStatus;

        public CellRequestStatus(CellBindHelper cellBindHelper, RequestStatus requestStatus) {
            super(cellBindHelper, R.layout.zs_request_system_message, -9223372036854775807L, -2147483648L, new Date());
            this.requestStatus = requestStatus;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellRequestStatus;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            TextView textView = (TextView) requestViewHolder.findCachedView(R.id.request_system_message_text);
            if (this.requestStatus == RequestStatus.Closed) {
                textView.setText(R.string.request_system_message_closed_ticket);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class CellSystemMessage extends CellBase {
        private final String message;

        public CellSystemMessage(Date date, String str) {
            super(null, R.layout.zs_request_system_message, Long.MIN_VALUE, -2147483648L, date);
            this.message = str;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellSystemMessage;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            ((TextView) requestViewHolder.findCachedView(R.id.request_system_message_text)).setText(this.message);
        }
    }
}
