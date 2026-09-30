package Nf;

import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public interface ac extends KSerializer {
    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
