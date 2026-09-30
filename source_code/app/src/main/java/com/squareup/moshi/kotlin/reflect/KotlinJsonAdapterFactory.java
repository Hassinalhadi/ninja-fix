package com.squareup.moshi.kotlin.reflect;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import ge.InterfaceC1775g;
import ge.InterfaceC1780l;
import ge.InterfaceC1783o;
import ge.u;
import ge.v;
import ge.w;
import ge.x;
import ge.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.C1983w;
import je.C1986z;
import je.U;
import je.ah;
import je.av;
import je.r;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.InterfaceC2334j;
import s6.AbstractC2751q5;
import s6.AbstractC2768s5;
import t6.AbstractC3062u;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", Constants.KEY_TYPE, "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KotlinJsonAdapterFactory implements JsonAdapter.Factory {
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0284, code lost:
    
        if (r10 == null) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Class<? extends Annotation> cls;
        Object obj;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Object obj2;
        int i4;
        String name;
        Type charlie;
        int i5;
        Type type2;
        Json json;
        Intrinsics.echo(type, "type");
        Intrinsics.echo(annotations, "annotations");
        Intrinsics.echo(moshi, "moshi");
        String str = null;
        if (annotations.isEmpty()) {
            Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type);
            if (!rawType.isInterface() && !rawType.isEnum()) {
                cls = KotlinJsonAdapterKt.KOTLIN_METADATA;
                if (rawType.isAnnotationPresent(cls) && !Util.isPlatformType(rawType)) {
                    try {
                        JsonAdapter<?> generatedAdapter = Util.generatedAdapter(moshi, type, rawType);
                        if (generatedAdapter != null) {
                            return generatedAdapter;
                        }
                    } catch (RuntimeException e) {
                        if (!(e.getCause() instanceof ClassNotFoundException)) {
                            throw e;
                        }
                    }
                    if (!rawType.isLocalClass()) {
                        InterfaceC1772d echo = AbstractC3062u.echo(rawType);
                        if (!echo.isAbstract()) {
                            if (!echo.india()) {
                                if (echo.lima() == null) {
                                    if (!echo.mike()) {
                                        U u4 = ((C1986z) echo).red;
                                        C1983w c1983w = (C1983w) u4.invoke();
                                        c1983w.getClass();
                                        v vVar = C1983w.oscar[4];
                                        Object invoke = c1983w.foxtrot.invoke();
                                        Intrinsics.delta(invoke, "<get-constructors>(...)");
                                        Iterator it = ((Collection) invoke).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj = it.next();
                                                InterfaceC1775g interfaceC1775g = (InterfaceC1775g) obj;
                                                Intrinsics.charlie(interfaceC1775g, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
                                                if (((InterfaceC2334j) ((ah) interfaceC1775g).tango()).yankee()) {
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                        InterfaceC1775g interfaceC1775g2 = (InterfaceC1775g) obj;
                                        if (interfaceC1775g2 != null) {
                                            List parameters = interfaceC1775g2.getParameters();
                                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                                            int quebec = y.quebec(collectionSizeOrDefault);
                                            if (quebec < 16) {
                                                quebec = 16;
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                                            for (Object obj3 : parameters) {
                                                linkedHashMap.put(((av) ((InterfaceC1783o) obj3)).getName(), obj3);
                                            }
                                            AbstractC2751q5.bravo(interfaceC1775g2);
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            C1983w c1983w2 = (C1983w) u4.invoke();
                                            c1983w2.getClass();
                                            v vVar2 = C1983w.oscar[14];
                                            Object invoke2 = c1983w2.mike.invoke();
                                            Intrinsics.delta(invoke2, "<get-allNonStaticMembers>(...)");
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : (Collection) invoke2) {
                                                r rVar = (r) obj4;
                                                if (rVar.tango().g() == null && (rVar instanceof u)) {
                                                    arrayList.add(obj4);
                                                }
                                            }
                                            Iterator it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                u uVar = (u) it2.next();
                                                InterfaceC1783o interfaceC1783o = (InterfaceC1783o) linkedHashMap.get(uVar.getName());
                                                AbstractC2751q5.bravo(uVar);
                                                Iterator it3 = uVar.getAnnotations().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        obj2 = it3.next();
                                                        if (((Annotation) obj2) instanceof Json) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj2 = str;
                                                        break;
                                                    }
                                                }
                                                Json json2 = (Json) obj2;
                                                ArrayList B = CollectionsKt.B(uVar.getAnnotations());
                                                if (interfaceC1783o != null) {
                                                    av avVar = (av) interfaceC1783o;
                                                    CollectionsKt__MutableCollectionsKt.addAll(B, avVar.getAnnotations());
                                                    if (json2 == null) {
                                                        Iterator it4 = avVar.getAnnotations().iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                json = it4.next();
                                                                if (((Annotation) json) instanceof Json) {
                                                                    break;
                                                                }
                                                            } else {
                                                                json = str;
                                                                break;
                                                            }
                                                        }
                                                        json2 = json;
                                                    }
                                                }
                                                Field alpha = AbstractC2768s5.alpha(uVar);
                                                if (alpha != null) {
                                                    i4 = alpha.getModifiers();
                                                } else {
                                                    i4 = 0;
                                                }
                                                if (Modifier.isTransient(i4)) {
                                                    if (interfaceC1783o != null && !((av) interfaceC1783o).papa()) {
                                                        throw new IllegalArgumentException(("No default value for transient constructor " + interfaceC1783o).toString());
                                                    }
                                                } else if (json2 != null && json2.ignore()) {
                                                    if (interfaceC1783o != null && !((av) interfaceC1783o).papa()) {
                                                        throw new IllegalArgumentException(("No default value for ignored constructor " + interfaceC1783o).toString());
                                                    }
                                                } else {
                                                    if (interfaceC1783o != null) {
                                                        av avVar2 = (av) interfaceC1783o;
                                                        if (!Intrinsics.areEqual(avVar2.oscar(), uVar.getReturnType())) {
                                                            StringBuilder sb2 = new StringBuilder("'");
                                                            sb2.append(uVar.getName());
                                                            sb2.append("' has a constructor parameter of type ");
                                                            Intrinsics.checkNotNull(interfaceC1783o);
                                                            sb2.append(avVar2.oscar());
                                                            sb2.append(" but a property of type ");
                                                            sb2.append(uVar.getReturnType());
                                                            sb2.append('.');
                                                            throw new IllegalArgumentException(sb2.toString().toString());
                                                        }
                                                    }
                                                    if ((uVar instanceof InterfaceC1780l) || interfaceC1783o != null) {
                                                        if (json2 != null && (name = json2.name()) != null) {
                                                            if (Intrinsics.areEqual(name, Json.UNSET_NAME)) {
                                                                name = str;
                                                            }
                                                        }
                                                        name = uVar.getName();
                                                        String str2 = name;
                                                        InterfaceC1773e foxtrot = uVar.getReturnType().foxtrot();
                                                        if (foxtrot instanceof InterfaceC1772d) {
                                                            InterfaceC1772d interfaceC1772d = (InterfaceC1772d) foxtrot;
                                                            if (interfaceC1772d.hotel()) {
                                                                charlie = AbstractC3062u.bravo(interfaceC1772d);
                                                                if (!uVar.getReturnType().delta().isEmpty()) {
                                                                    List delta = uVar.getReturnType().delta();
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    Iterator it5 = delta.iterator();
                                                                    while (it5.hasNext()) {
                                                                        w wVar = ((z) it5.next()).bravo;
                                                                        if (wVar != null) {
                                                                            type2 = AbstractC2768s5.charlie(wVar);
                                                                        } else {
                                                                            type2 = null;
                                                                        }
                                                                        if (type2 != null) {
                                                                            arrayList2.add(type2);
                                                                        }
                                                                    }
                                                                    Type[] typeArr = (Type[]) arrayList2.toArray(new Type[0]);
                                                                    charlie = Types.newParameterizedType(charlie, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                                                }
                                                            } else {
                                                                charlie = AbstractC2768s5.charlie(uVar.getReturnType());
                                                            }
                                                        } else if (foxtrot instanceof x) {
                                                            charlie = AbstractC2768s5.charlie(uVar.getReturnType());
                                                        } else {
                                                            throw new IllegalStateException("Not possible!");
                                                        }
                                                        JsonAdapter adapter = moshi.adapter(Util.resolve(type, rawType, charlie), Util.jsonAnnotations((Annotation[]) B.toArray(new Annotation[0])), uVar.getName());
                                                        String name2 = uVar.getName();
                                                        Intrinsics.delta(adapter, "adapter");
                                                        if (interfaceC1783o != null) {
                                                            i5 = ((av) interfaceC1783o).purple;
                                                        } else {
                                                            i5 = -1;
                                                        }
                                                        linkedHashMap2.put(name2, new KotlinJsonAdapter.Binding(str2, adapter, uVar, interfaceC1783o, i5));
                                                        str = null;
                                                    }
                                                }
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it6 = interfaceC1775g2.getParameters().iterator();
                                            while (it6.hasNext()) {
                                                av avVar3 = (av) ((InterfaceC1783o) it6.next());
                                                KotlinJsonAdapter.Binding binding = (KotlinJsonAdapter.Binding) kotlin.jvm.internal.x.charlie(linkedHashMap2).remove(avVar3.getName());
                                                if (binding == null && !avVar3.papa()) {
                                                    throw new IllegalArgumentException(("No property for required constructor " + avVar3).toString());
                                                }
                                                arrayList3.add(binding);
                                            }
                                            int size = arrayList3.size();
                                            Iterator it7 = linkedHashMap2.entrySet().iterator();
                                            while (true) {
                                                int i10 = size;
                                                if (!it7.hasNext()) {
                                                    break;
                                                }
                                                size = i10 + 1;
                                                arrayList3.add(KotlinJsonAdapter.Binding.copy$default((KotlinJsonAdapter.Binding) ((Map.Entry) it7.next()).getValue(), null, null, null, null, i10, 15, null));
                                            }
                                            ArrayList emerald = CollectionsKt.emerald(arrayList3);
                                            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(emerald, 10);
                                            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                                            Iterator it8 = emerald.iterator();
                                            while (it8.hasNext()) {
                                                arrayList4.add(((KotlinJsonAdapter.Binding) it8.next()).getJsonName());
                                            }
                                            String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                                            JsonReader.Options options = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
                                            Intrinsics.delta(options, "options");
                                            return new KotlinJsonAdapter(interfaceC1775g2, arrayList3, emerald, options).nullSafe();
                                        }
                                    } else {
                                        throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + rawType.getName() + ". Please register an adapter.").toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException("Cannot serialize object declaration ".concat(rawType.getName()).toString());
                                }
                            } else {
                                throw new IllegalArgumentException("Cannot serialize inner class ".concat(rawType.getName()).toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Cannot serialize abstract class ".concat(rawType.getName()).toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot serialize local class or object expression ".concat(rawType.getName()).toString());
                    }
                }
            }
        }
        return null;
    }
}
