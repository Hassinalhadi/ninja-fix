package bn;

import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.ak;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class i extends ak {
    public final String bravo;
    public int charlie;

    public i(InterfaceC0523v interfaceC0523v) {
        super(interfaceC0523v);
        this.bravo = "virtual-" + interfaceC0523v.bravo() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.ak, androidx.camera.core.impl.InterfaceC0523v
    public final int alpha() {
        return golf(0);
    }

    @Override // androidx.camera.core.impl.ak, androidx.camera.core.impl.InterfaceC0523v
    public final String bravo() {
        return this.bravo;
    }

    @Override // androidx.camera.core.impl.ak, androidx.camera.core.impl.InterfaceC0523v
    public final int golf(int i4) {
        return bc.f.foxtrot(this.alpha.golf(i4) - this.charlie);
    }
}
