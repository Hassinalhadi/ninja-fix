package zendesk.support.request;

import androidx.appcompat.widget.P0;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateMessageStatus implements Serializable {
    static final int DELIVERED = 2;
    static final int ERROR = 1;
    static final int PENDING = 3;
    private final String errorResponse;
    private final int status;

    private StateMessageStatus(int i4, String str) {
        this.status = i4;
        this.errorResponse = str;
    }

    public static StateMessageStatus delivered() {
        return new StateMessageStatus(2, null);
    }

    public static StateMessageStatus error(String str) {
        return new StateMessageStatus(1, str);
    }

    public static StateMessageStatus pending() {
        return new StateMessageStatus(3, null);
    }

    public String getErrorResponse() {
        return this.errorResponse;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        String str;
        int i4 = this.status;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    str = "Unknown";
                } else {
                    str = "Pending";
                }
            } else {
                str = "Delivered";
            }
        } else {
            str = "Error";
        }
        return P0.fuchsia(Q0.c.victor("MessageState{status=", str, ", errorResponse="), this.errorResponse, '}');
    }
}
