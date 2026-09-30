package A7;

import bd.AbstractC0754g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import s7.InterfaceC2834a;

/* loaded from: classes2.dex */
public final class j implements InterfaceC2834a {
    public final i alpha;
    public final i bravo;
    public final /* synthetic */ int charlie;

    public j(int i4, byte[] bArr) {
        this.charlie = i4;
        this.alpha = delta(1, bArr);
        this.bravo = delta(0, bArr);
    }

    public static byte[] charlie(ByteBuffer byteBuffer, byte[] bArr) {
        int length;
        int i4;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i5 = remaining % 16;
        if (i5 == 0) {
            i4 = remaining;
        } else {
            i4 = (remaining + 16) - i5;
        }
        int i10 = i4 + length;
        ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i10);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // s7.InterfaceC2834a
    public final byte[] alpha(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        i iVar = this.alpha;
        if (length <= 2147483631 - iVar.golf()) {
            ByteBuffer allocate = ByteBuffer.allocate(iVar.golf() + bArr.length + 16);
            if (allocate.remaining() >= iVar.golf() + bArr.length + 16) {
                int position = allocate.position();
                iVar.foxtrot(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[iVar.golf()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.bravo.charlie(0, bArr3).get(bArr4);
                byte[] alpha = com.bumptech.glide.d.alpha(bArr4, charlie(allocate, bArr2));
                allocate.limit(allocate.limit() + 16);
                allocate.put(alpha);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // s7.InterfaceC2834a
    public final byte[] bravo(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        i iVar = this.alpha;
        if (remaining >= iVar.golf() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[iVar.golf()];
            wrap.get(bArr4);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr5 = new byte[32];
                this.bravo.charlie(0, bArr4).get(bArr5);
                if (AbstractC0754g.bravo(com.bumptech.glide.d.alpha(bArr5, charlie(wrap, bArr2)), bArr3)) {
                    wrap.position(position);
                    return iVar.echo(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final i delta(int i4, byte[] bArr) {
        switch (this.charlie) {
            case 0:
                return new i(i4, bArr);
            default:
                return new i(i4, bArr);
        }
    }
}
