package zendesk.support.request;

import android.graphics.Rect;
import java.util.Date;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

/* loaded from: classes.dex */
abstract class CellBase implements CellType.Base {
    static final int GROUP_ID_END_USER = -2147483647;
    static final int GROUP_ID_SYSTEM_MESSAGE = Integer.MIN_VALUE;
    static final long ID_SYSTEM_MESSAGE_REQUEST_CLOSED = -9223372036854775807L;
    static final long ID_SYSTEM_MESSAGE_REQUEST_CREATED = Long.MIN_VALUE;
    private final long groupId;

    /* renamed from: id, reason: collision with root package name */
    private final long f14270id;
    private final int layoutId;
    private final Date timestamp;
    protected final CellBindHelper utils;
    private int positionType = 1;
    private Rect insets = new Rect(0, 0, 0, 0);

    public CellBase(CellBindHelper cellBindHelper, int i4, long j5, long j6, Date date) {
        this.utils = cellBindHelper;
        this.layoutId = i4;
        this.f14270id = j5;
        this.groupId = j6;
        this.timestamp = date;
    }

    @Override // zendesk.support.request.CellType.Base
    public abstract boolean areContentsTheSame(CellType.Base base);

    @Override // zendesk.support.request.CellType.Base
    public abstract void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder);

    @Override // zendesk.support.request.CellType.Base
    public long getGroupId() {
        return this.groupId;
    }

    @Override // zendesk.support.request.CellType.Base
    public Rect getInsets() {
        return this.insets;
    }

    @Override // zendesk.support.request.CellType.Base
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // zendesk.support.request.CellType.Base
    public int getPositionType() {
        return this.positionType;
    }

    @Override // zendesk.support.request.CellType.Base
    public Date getTimeStamp() {
        return this.timestamp;
    }

    @Override // zendesk.support.request.CellType.Base
    public long getUniqueId() {
        return this.f14270id;
    }

    @Override // zendesk.support.request.CellType.Base
    public void setPositionType(int i4) {
        this.positionType = i4 | this.positionType;
    }
}
