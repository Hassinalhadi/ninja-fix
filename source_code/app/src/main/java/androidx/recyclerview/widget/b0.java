package androidx.recyclerview.widget;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class b0 {
    public int alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;
    public boolean foxtrot;
    public boolean golf;
    public boolean hotel;
    public boolean india;
    public boolean juliet;
    public boolean kilo;
    public int lima;
    public long mike;
    public int november;

    public final void alpha(int i4) {
        if ((this.delta & i4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.delta));
    }

    public final int bravo() {
        if (this.golf) {
            return this.bravo - this.charlie;
        }
        return this.echo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.alpha);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.echo);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.india);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.bravo);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.charlie);
        sb2.append(", mStructureChanged=");
        sb2.append(this.foxtrot);
        sb2.append(", mInPreLayout=");
        sb2.append(this.golf);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.juliet);
        sb2.append(", mRunPredictiveAnimations=");
        return P0.gray(sb2, this.kilo, '}');
    }
}
