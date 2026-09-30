package zendesk.classic.messaging.ui;

import zendesk.classic.messaging.MessagingItem;

/* loaded from: classes.dex */
abstract class EndUserCellBaseState {

    /* renamed from: id, reason: collision with root package name */
    private final String f14227id;
    private final MessageActionListener messageActionListener;
    private final MessagingCellProps props;
    private final MessagingItem.Query.Status status;

    public EndUserCellBaseState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener) {
        this.f14227id = str;
        this.props = messagingCellProps;
        this.status = status;
        this.messageActionListener = messageActionListener;
    }

    public boolean equals(Object obj) {
        boolean z2;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EndUserCellBaseState endUserCellBaseState = (EndUserCellBaseState) obj;
            String str = this.f14227id;
            if (str == null ? endUserCellBaseState.f14227id != null : !str.equals(endUserCellBaseState.f14227id)) {
                return false;
            }
            MessagingCellProps messagingCellProps = this.props;
            if (messagingCellProps == null ? endUserCellBaseState.props != null : !messagingCellProps.equals(endUserCellBaseState.props)) {
                return false;
            }
            if (this.status != endUserCellBaseState.status) {
                return false;
            }
            if (this.messageActionListener != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (endUserCellBaseState.messageActionListener == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 == z10) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.f14227id;
    }

    public MessageActionListener getMessageActionListener() {
        return this.messageActionListener;
    }

    public MessagingCellProps getProps() {
        return this.props;
    }

    public MessagingItem.Query.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i10;
        String str = this.f14227id;
        int i11 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = i4 * 31;
        MessagingCellProps messagingCellProps = this.props;
        if (messagingCellProps != null) {
            i5 = messagingCellProps.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        MessagingItem.Query.Status status = this.status;
        if (status != null) {
            i10 = status.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        MessageActionListener messageActionListener = this.messageActionListener;
        if (messageActionListener != null) {
            i11 = messageActionListener.hashCode();
        }
        return i14 + i11;
    }
}
