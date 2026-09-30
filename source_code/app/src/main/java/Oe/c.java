package Oe;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public abstract class c implements x {
    static {
        int i4 = h.bravo;
    }

    public static void bravo(v vVar) {
        UninitializedMessageException uninitializedMessageException;
        if (vVar != null && !vVar.alpha()) {
            if (vVar instanceof b) {
                uninitializedMessageException = new UninitializedMessageException((b) vVar);
            } else {
                uninitializedMessageException = new UninitializedMessageException(vVar);
            }
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage(vVar);
        }
    }

    public final v charlie(ByteArrayInputStream byteArrayInputStream, h hVar) {
        v vVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                vVar = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i4 = 7;
                    while (true) {
                        if (i4 < 32) {
                            int read2 = byteArrayInputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i4;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i4 += 7;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        } else {
                            while (i4 < 64) {
                                int read3 = byteArrayInputStream.read();
                                if (read3 != -1) {
                                    if ((read3 & 128) != 0) {
                                        i4 += 7;
                                    }
                                } else {
                                    throw InvalidProtocolBufferException.truncatedMessage();
                                }
                            }
                            throw InvalidProtocolBufferException.malformedVarint();
                        }
                    }
                }
                f fVar = new f(new a(byteArrayInputStream, read));
                v vVar2 = (v) alpha(fVar, hVar);
                try {
                    if (fVar.foxtrot == 0) {
                        vVar = vVar2;
                    } else {
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(vVar2);
                }
            }
            bravo(vVar);
            return vVar;
        } catch (IOException e4) {
            throw new InvalidProtocolBufferException(e4.getMessage());
        }
    }
}
