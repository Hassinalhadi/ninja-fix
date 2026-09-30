package com.squareup.moshi.kotlin.reflect;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import ge.InterfaceC1775g;
import ge.InterfaceC1780l;
import ge.InterfaceC1783o;
import ge.u;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.av;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002%&BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lge/g;", "constructor", "", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "", "allBindings", "nonIgnoredBindings", "Lcom/squareup/moshi/JsonReader$Options;", "options", "<init>", "(Lge/g;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lge/g;", "getConstructor", "()Lge/g;", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "getNonIgnoredBindings", "Lcom/squareup/moshi/JsonReader$Options;", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "Binding", "IndexedParameterMap", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KotlinJsonAdapter<T> extends JsonAdapter<T> {

    @NotNull
    private final List<Binding<T, Object>> allBindings;

    @NotNull
    private final InterfaceC1775g constructor;

    @NotNull
    private final List<Binding<T, Object>> nonIgnoredBindings;

    @NotNull
    private final JsonReader.Options options;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jb\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010 ¨\u00063"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "K", "P", "", "", "jsonName", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "Lge/u;", "property", "Lge/o;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lge/u;Lge/o;I)V", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/squareup/moshi/JsonAdapter;", "component3", "()Lge/u;", "component4", "()Lge/o;", "component5", "()I", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lge/u;Lge/o;I)Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonName", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "Lge/u;", "getProperty", "Lge/o;", "getParameter", "I", "getPropertyIndex", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Binding<K, P> {

        @NotNull
        private final JsonAdapter<P> adapter;

        @NotNull
        private final String jsonName;

        @Nullable
        private final InterfaceC1783o parameter;

        @NotNull
        private final u property;
        private final int propertyIndex;

        public Binding(@NotNull String jsonName, @NotNull JsonAdapter<P> adapter, @NotNull u property, @Nullable InterfaceC1783o interfaceC1783o, int i4) {
            Intrinsics.echo(jsonName, "jsonName");
            Intrinsics.echo(adapter, "adapter");
            Intrinsics.echo(property, "property");
            this.jsonName = jsonName;
            this.adapter = adapter;
            this.property = property;
            this.parameter = interfaceC1783o;
            this.propertyIndex = i4;
        }

        public static /* synthetic */ Binding copy$default(Binding binding, String str, JsonAdapter jsonAdapter, u uVar, InterfaceC1783o interfaceC1783o, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = binding.jsonName;
            }
            if ((i5 & 2) != 0) {
                jsonAdapter = binding.adapter;
            }
            if ((i5 & 4) != 0) {
                uVar = binding.property;
            }
            if ((i5 & 8) != 0) {
                interfaceC1783o = binding.parameter;
            }
            if ((i5 & 16) != 0) {
                i4 = binding.propertyIndex;
            }
            int i10 = i4;
            u uVar2 = uVar;
            return binding.copy(str, jsonAdapter, uVar2, interfaceC1783o, i10);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getJsonName() {
            return this.jsonName;
        }

        @NotNull
        public final JsonAdapter<P> component2() {
            return this.adapter;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final u getProperty() {
            return this.property;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final InterfaceC1783o getParameter() {
            return this.parameter;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        @NotNull
        public final Binding<K, P> copy(@NotNull String jsonName, @NotNull JsonAdapter<P> adapter, @NotNull u property, @Nullable InterfaceC1783o interfaceC1783o, int i4) {
            Intrinsics.echo(jsonName, "jsonName");
            Intrinsics.echo(adapter, "adapter");
            Intrinsics.echo(property, "property");
            return new Binding<>(jsonName, adapter, property, interfaceC1783o, i4);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binding)) {
                return false;
            }
            Binding binding = (Binding) other;
            return Intrinsics.areEqual(this.jsonName, binding.jsonName) && Intrinsics.areEqual(this.adapter, binding.adapter) && Intrinsics.areEqual(this.property, binding.property) && Intrinsics.areEqual(this.parameter, binding.parameter) && this.propertyIndex == binding.propertyIndex;
        }

        public final P get(K value) {
            return (P) this.property.get(value);
        }

        @NotNull
        public final JsonAdapter<P> getAdapter() {
            return this.adapter;
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }

        @Nullable
        public final InterfaceC1783o getParameter() {
            return this.parameter;
        }

        @NotNull
        public final u getProperty() {
            return this.property;
        }

        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        public int hashCode() {
            int hashCode = (this.property.hashCode() + ((this.adapter.hashCode() + (this.jsonName.hashCode() * 31)) * 31)) * 31;
            InterfaceC1783o interfaceC1783o = this.parameter;
            return ((hashCode + (interfaceC1783o == null ? 0 : interfaceC1783o.hashCode())) * 31) + this.propertyIndex;
        }

        public final void set(K result, P value) {
            Object obj;
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            if (value != obj) {
                u uVar = this.property;
                Intrinsics.charlie(uVar, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                ((InterfaceC1780l) uVar).echo(result, value);
            }
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Binding(jsonName=");
            sb2.append(this.jsonName);
            sb2.append(", adapter=");
            sb2.append(this.adapter);
            sb2.append(", property=");
            sb2.append(this.property);
            sb2.append(", parameter=");
            sb2.append(this.parameter);
            sb2.append(", propertyIndex=");
            return c.quebec(sb2, this.propertyIndex, ')');
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$IndexedParameterMap;", "Lkotlin/collections/h;", "Lge/o;", "", "", "parameterKeys", "", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", Constants.KEY_KEY, "value", "put", "(Lge/o;Ljava/lang/Object;)Ljava/lang/Object;", "", "containsKey", "(Lge/o;)Z", "get", "(Lge/o;)Ljava/lang/Object;", "Ljava/util/List;", "[Ljava/lang/Object;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class IndexedParameterMap extends h {

        @NotNull
        private final List<InterfaceC1783o> parameterKeys;

        @NotNull
        private final Object[] parameterValues;

        /* JADX WARN: Multi-variable type inference failed */
        public IndexedParameterMap(@NotNull List<? extends InterfaceC1783o> parameterKeys, @NotNull Object[] parameterValues) {
            Intrinsics.echo(parameterKeys, "parameterKeys");
            Intrinsics.echo(parameterValues, "parameterValues");
            this.parameterKeys = parameterKeys;
            this.parameterValues = parameterValues;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof InterfaceC1783o) {
                return containsKey((InterfaceC1783o) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof InterfaceC1783o) {
                return get((InterfaceC1783o) obj);
            }
            return null;
        }

        @Override // kotlin.collections.h
        @NotNull
        public Set<Map.Entry<InterfaceC1783o, Object>> getEntries() {
            int collectionSizeOrDefault;
            Object obj;
            List<InterfaceC1783o> list = this.parameterKeys;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i4 = 0;
            for (T t5 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new AbstractMap.SimpleEntry((InterfaceC1783o) t5, this.parameterValues[i4]));
                i4 = i5;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object value = ((AbstractMap.SimpleEntry) next).getValue();
                obj = KotlinJsonAdapterKt.ABSENT_VALUE;
                if (value != obj) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }

        public /* bridge */ Object getOrDefault(InterfaceC1783o interfaceC1783o, Object obj) {
            return super.getOrDefault((Object) interfaceC1783o, (InterfaceC1783o) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @Nullable
        public Object put(@NotNull InterfaceC1783o r12, @Nullable Object value) {
            Intrinsics.echo(r12, "key");
            return null;
        }

        public /* bridge */ Object remove(InterfaceC1783o interfaceC1783o) {
            return super.remove((Object) interfaceC1783o);
        }

        public boolean containsKey(@NotNull InterfaceC1783o r22) {
            Object obj;
            Intrinsics.echo(r22, "key");
            Object obj2 = this.parameterValues[((av) r22).purple];
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            return obj2 != obj;
        }

        @Nullable
        public Object get(@NotNull InterfaceC1783o r22) {
            Object obj;
            Intrinsics.echo(r22, "key");
            Object obj2 = this.parameterValues[((av) r22).purple];
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            if (obj2 != obj) {
                return obj2;
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof InterfaceC1783o) ? obj2 : getOrDefault((InterfaceC1783o) obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof InterfaceC1783o) {
                return remove((InterfaceC1783o) obj);
            }
            return null;
        }

        public /* bridge */ boolean remove(InterfaceC1783o interfaceC1783o, Object obj) {
            return super.remove((Object) interfaceC1783o, obj);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof InterfaceC1783o) {
                return remove((InterfaceC1783o) obj, obj2);
            }
            return false;
        }
    }

    public KotlinJsonAdapter(@NotNull InterfaceC1775g constructor, @NotNull List<Binding<T, Object>> allBindings, @NotNull List<Binding<T, Object>> nonIgnoredBindings, @NotNull JsonReader.Options options) {
        Intrinsics.echo(constructor, "constructor");
        Intrinsics.echo(allBindings, "allBindings");
        Intrinsics.echo(nonIgnoredBindings, "nonIgnoredBindings");
        Intrinsics.echo(options, "options");
        this.constructor = constructor;
        this.allBindings = allBindings;
        this.nonIgnoredBindings = nonIgnoredBindings;
        this.options = options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(@NotNull JsonReader reader) {
        boolean z2;
        T t5;
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.echo(reader, "reader");
        int size = this.constructor.getParameters().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            obj3 = KotlinJsonAdapterKt.ABSENT_VALUE;
            objArr[i4] = obj3;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else {
                Binding<T, Object> binding = this.nonIgnoredBindings.get(selectName);
                int propertyIndex = binding.getPropertyIndex();
                Object obj4 = objArr[propertyIndex];
                obj2 = KotlinJsonAdapterKt.ABSENT_VALUE;
                if (obj4 == obj2) {
                    Object fromJson = binding.getAdapter().fromJson(reader);
                    objArr[propertyIndex] = fromJson;
                    if (fromJson == null && !binding.getProperty().getReturnType().alpha()) {
                        JsonDataException unexpectedNull = Util.unexpectedNull(binding.getProperty().getName(), binding.getJsonName(), reader);
                        Intrinsics.delta(unexpectedNull, "unexpectedNull(\n        …         reader\n        )");
                        throw unexpectedNull;
                    }
                } else {
                    throw new JsonDataException("Multiple values for '" + binding.getProperty().getName() + "' at " + reader.getPath());
                }
            }
        }
        reader.endObject();
        if (this.allBindings.size() == size) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i5 = 0; i5 < size; i5++) {
            Object obj5 = objArr[i5];
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            if (obj5 == obj) {
                if (((av) ((InterfaceC1783o) this.constructor.getParameters().get(i5))).papa()) {
                    z2 = false;
                } else {
                    String str = null;
                    if (((av) ((InterfaceC1783o) this.constructor.getParameters().get(i5))).oscar().alpha.indigo()) {
                        objArr[i5] = null;
                    } else {
                        String name = ((av) ((InterfaceC1783o) this.constructor.getParameters().get(i5))).getName();
                        Binding<T, Object> binding2 = this.allBindings.get(i5);
                        if (binding2 != null) {
                            str = binding2.getJsonName();
                        }
                        JsonDataException missingProperty = Util.missingProperty(name, str, reader);
                        Intrinsics.delta(missingProperty, "missingProperty(\n       …       reader\n          )");
                        throw missingProperty;
                    }
                }
            }
        }
        if (z2) {
            t5 = (T) this.constructor.call(Arrays.copyOf(objArr, size2));
        } else {
            t5 = (T) this.constructor.callBy(new IndexedParameterMap(this.constructor.getParameters(), objArr));
        }
        int size3 = this.allBindings.size();
        while (size < size3) {
            Binding<T, Object> binding3 = this.allBindings.get(size);
            Intrinsics.checkNotNull(binding3);
            binding3.set(t5, objArr[size]);
            size++;
        }
        return t5;
    }

    @NotNull
    public final List<Binding<T, Object>> getAllBindings() {
        return this.allBindings;
    }

    @NotNull
    public final InterfaceC1775g getConstructor() {
        return this.constructor;
    }

    @NotNull
    public final List<Binding<T, Object>> getNonIgnoredBindings() {
        return this.nonIgnoredBindings;
    }

    @NotNull
    public final JsonReader.Options getOptions() {
        return this.options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter writer, @Nullable T value) {
        Intrinsics.echo(writer, "writer");
        if (value != null) {
            writer.beginObject();
            for (Binding<T, Object> binding : this.allBindings) {
                if (binding != null) {
                    writer.name(binding.getJsonName());
                    binding.getAdapter().toJson(writer, (JsonWriter) binding.get(value));
                }
            }
            writer.endObject();
            return;
        }
        throw new NullPointerException("value == null");
    }

    @NotNull
    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.getReturnType() + ')';
    }
}
