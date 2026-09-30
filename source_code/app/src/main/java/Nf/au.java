package Nf;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class au implements SerialDescriptor {
    public static final au alpha = new Object();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return (Lf.l.echo.hashCode() * 31) - 1818355776;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return Lf.l.echo;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return "kotlin.Nothing";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean papa() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }
}
