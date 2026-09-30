package Pf;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {
    public final Hd.b alpha;
    public final CharsetDecoder bravo;
    public final ByteBuffer charlie;
    public boolean delta;
    public char echo;

    public i(Hd.b bVar, Charset charset) {
        Object removeLast;
        byte[] bArr;
        Intrinsics.echo(charset, "charset");
        this.alpha = bVar;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        Intrinsics.delta(onUnmappableCharacter, "onUnmappableCharacter(...)");
        this.bravo = onUnmappableCharacter;
        e eVar = e.purple;
        synchronized (eVar) {
            kotlin.collections.l lVar = (kotlin.collections.l) eVar.alpha;
            if (lVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = lVar.removeLast();
            }
            byte[] bArr2 = (byte[]) removeLast;
            bArr = bArr2 != null ? bArr2 : null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        Intrinsics.delta(wrap, "wrap(...)");
        this.charlie = wrap;
        wrap.flip();
    }

    public final int alpha(char[] cArr, int i4, int i5) {
        int i10;
        CharsetDecoder charsetDecoder;
        int i11;
        char c3;
        if (i5 == 0) {
            return 0;
        }
        if (i4 >= 0 && i4 < cArr.length && i5 >= 0 && i4 + i5 <= cArr.length) {
            boolean z2 = true;
            if (this.delta) {
                cArr[i4] = this.echo;
                i4++;
                i5--;
                this.delta = false;
                if (i5 == 0) {
                    return 1;
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i12 = -1;
            if (i5 == 1) {
                if (this.delta) {
                    this.delta = false;
                    c3 = this.echo;
                } else {
                    char[] cArr2 = new char[2];
                    int alpha = alpha(cArr2, 0, 2);
                    if (alpha != -1) {
                        if (alpha != 1) {
                            if (alpha == 2) {
                                this.echo = cArr2[1];
                                this.delta = true;
                                c3 = cArr2[0];
                            } else {
                                throw new IllegalStateException(("Unreachable state: " + alpha).toString());
                            }
                        } else {
                            c3 = cArr2[0];
                        }
                    } else {
                        c3 = 65535;
                    }
                }
                if (c3 == 65535) {
                    if (i10 == 0) {
                        return -1;
                    }
                    return i10;
                }
                cArr[i4] = c3;
                return i10 + 1;
            }
            CharBuffer wrap = CharBuffer.wrap(cArr, i4, i5);
            if (wrap.position() != 0) {
                wrap = wrap.slice();
            }
            CharBuffer charBuffer = wrap;
            boolean z10 = false;
            while (true) {
                charsetDecoder = this.bravo;
                ByteBuffer byteBuffer = this.charlie;
                CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
                if (decode.isUnderflow()) {
                    if (z10 || !charBuffer.hasRemaining()) {
                        break;
                    }
                    byteBuffer.compact();
                    try {
                        int limit = byteBuffer.limit();
                        int position = byteBuffer.position();
                        if (position <= limit) {
                            i11 = limit - position;
                        } else {
                            i11 = 0;
                        }
                        int read = this.alpha.read(byteBuffer.array(), byteBuffer.arrayOffset() + position, i11);
                        if (read >= 0) {
                            byteBuffer.position(position + read);
                            byteBuffer.flip();
                            read = byteBuffer.remaining();
                        }
                        if (read < 0) {
                            if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                                break;
                            }
                            charsetDecoder.reset();
                            z10 = true;
                        } else {
                            continue;
                        }
                    } finally {
                        byteBuffer.flip();
                    }
                } else {
                    if (decode.isOverflow()) {
                        charBuffer.position();
                        break;
                    }
                    decode.throwException();
                }
            }
            z2 = z10;
            if (z2) {
                charsetDecoder.reset();
            }
            if (charBuffer.position() != 0) {
                i12 = charBuffer.position();
            }
            return i12 + i10;
        }
        StringBuilder hotel = av.q.hotel(i4, i5, "Unexpected arguments: ", ", ", ", ");
        hotel.append(cArr.length);
        throw new IllegalArgumentException(hotel.toString().toString());
    }
}
