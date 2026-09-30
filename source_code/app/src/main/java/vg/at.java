package vg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class at {
    public final ConcurrentHashMap alpha = new ConcurrentHashMap();
    public final Call.Factory bravo;
    public final HttpUrl charlie;
    public final List delta;
    public final int echo;
    public final List foxtrot;
    public final int golf;
    public final Executor hotel;

    public at(Call.Factory factory, HttpUrl httpUrl, List list, int i4, List list2, int i5, Executor executor) {
        this.bravo = factory;
        this.charlie = httpUrl;
        this.delta = list;
        this.echo = i4;
        this.foxtrot = list2;
        this.golf = i5;
        this.hotel = executor;
    }

    public final f alpha(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.foxtrot;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            f fVar = ((e) list.get(i4)).get(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((e) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Object bravo(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ar(this, cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final m charlie(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.delta;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            m alpha = ((l) list.get(i4)).alpha(type, annotationArr);
            if (alpha != null) {
                return alpha;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final m delta(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.delta;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i4 = indexOf; i4 < size; i4++) {
            m bravo = ((l) list.get(i4)).bravo(type, annotationArr, this);
            if (bravo != null) {
                return bravo;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void echo(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.delta;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((l) list.get(i4)).getClass();
        }
    }
}
