package e8;

import b8.C0732b;
import b8.InterfaceC0734d;
import b8.InterfaceC0736f;
import com.google.firebase.encoders.EncodingException;
import s6.T;
import t6.C2988f;

/* renamed from: e8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1640h implements InterfaceC0736f {
    public final /* synthetic */ int alpha;
    public boolean bravo = false;
    public boolean charlie = false;
    public C0732b delta;
    public final InterfaceC0734d echo;

    public /* synthetic */ C1640h(InterfaceC0734d interfaceC0734d, int i4) {
        this.alpha = i4;
        this.echo = interfaceC0734d;
    }

    @Override // b8.InterfaceC0736f
    public final InterfaceC0736f bravo(String str) {
        switch (this.alpha) {
            case 0:
                if (!this.bravo) {
                    this.bravo = true;
                    ((C1638f) this.echo).hotel(this.delta, str, this.charlie);
                    return this;
                }
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.bravo) {
                    this.bravo = true;
                    ((T) this.echo).charlie(this.delta, str, this.charlie);
                    return this;
                }
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.bravo) {
                    this.bravo = true;
                    ((C2988f) this.echo).charlie(this.delta, str, this.charlie);
                    return this;
                }
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override // b8.InterfaceC0736f
    public final InterfaceC0736f charlie(boolean z2) {
        switch (this.alpha) {
            case 0:
                if (!this.bravo) {
                    this.bravo = true;
                    ((C1638f) this.echo).charlie(this.delta, z2 ? 1 : 0, this.charlie);
                    return this;
                }
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.bravo) {
                    this.bravo = true;
                    ((T) this.echo).hotel(this.delta, z2 ? 1 : 0, this.charlie);
                    return this;
                }
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.bravo) {
                    this.bravo = true;
                    ((C2988f) this.echo).hotel(this.delta, z2 ? 1 : 0, this.charlie);
                    return this;
                }
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
