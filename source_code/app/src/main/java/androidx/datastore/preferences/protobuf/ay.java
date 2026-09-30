package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class ay extends aw {
    @Override // androidx.datastore.preferences.protobuf.aw
    public final ax alpha(Object obj) {
        s sVar = (s) obj;
        ax axVar = sVar.unknownFields;
        if (axVar == ax.foxtrot) {
            ax axVar2 = new ax(0, new int[8], new Object[8], true);
            sVar.unknownFields = axVar2;
            return axVar2;
        }
        return axVar;
    }
}
