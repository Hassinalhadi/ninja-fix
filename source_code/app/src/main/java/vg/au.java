package vg;

import com.clevertap.android.sdk.network.api.CtApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Response;

/* loaded from: classes2.dex */
public abstract class au {
    /* JADX WARN: Code restructure failed: missing block: B:445:0x08c1, code lost:
    
        throw vg.A.oscar(r10, r8, "@Body parameters cannot be used with form or multi-part encoding.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        r0 = new java.lang.Object[r17];
        r0[0] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011e, code lost:
    
        throw vg.A.november(r10, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0927  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s alpha(at atVar, Class cls, Method method) {
        Method method2;
        Type genericReturnType;
        boolean z2;
        boolean z10;
        boolean mike;
        int i4;
        A a6;
        Annotation[][] annotationArr;
        int i5;
        A[] aArr;
        int i10;
        String str;
        int i11;
        A a8;
        A aiVar;
        A aeVar;
        z zVar;
        char c3;
        int i12;
        int i13;
        int i14;
        int i15 = -1;
        int i16 = 0;
        boolean z11 = 1;
        ao aoVar = new ao(atVar, cls, method);
        Annotation[] annotationArr2 = aoVar.delta;
        int length = annotationArr2.length;
        int i17 = 0;
        loop0: while (true) {
            Method method3 = aoVar.charlie;
            String str2 = "HEAD";
            if (i17 < length) {
                Annotation annotation = annotationArr2[i17];
                if (annotation instanceof yg.b) {
                    aoVar.bravo("DELETE", ((yg.b) annotation).value(), false);
                } else if (annotation instanceof yg.f) {
                    aoVar.bravo("GET", ((yg.f) annotation).value(), false);
                } else if (annotation instanceof yg.g) {
                    aoVar.bravo("HEAD", ((yg.g) annotation).value(), false);
                } else if (annotation instanceof yg.n) {
                    aoVar.bravo("PATCH", ((yg.n) annotation).value(), z11);
                } else if (annotation instanceof yg.o) {
                    aoVar.bravo("POST", ((yg.o) annotation).value(), z11);
                } else if (annotation instanceof yg.p) {
                    aoVar.bravo("PUT", ((yg.p) annotation).value(), z11);
                } else if (annotation instanceof yg.m) {
                    aoVar.bravo("OPTIONS", ((yg.m) annotation).value(), false);
                } else if (annotation instanceof yg.h) {
                    yg.h hVar = (yg.h) annotation;
                    aoVar.bravo(hVar.method(), hVar.path(), hVar.hasBody());
                } else {
                    if (annotation instanceof yg.k) {
                        yg.k kVar = (yg.k) annotation;
                        String[] value = kVar.value();
                        if (value.length != 0) {
                            boolean allowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                            Headers.Builder builder = new Headers.Builder();
                            int length2 = value.length;
                            int i18 = 0;
                            int i19 = z11;
                            while (i18 < length2) {
                                String str3 = value[i18];
                                int i20 = i19;
                                int indexOf = str3.indexOf(58);
                                if (indexOf == i15 || indexOf == 0) {
                                    break loop0;
                                }
                                int i21 = i15;
                                if (indexOf == str3.length() - 1) {
                                    break loop0;
                                }
                                String substring = str3.substring(0, indexOf);
                                String trim = str3.substring(indexOf + 1).trim();
                                if (CtApi.HEADER_CONTENT_TYPE.equalsIgnoreCase(substring)) {
                                    try {
                                        aoVar.uniform = MediaType.get(trim);
                                        i14 = i20;
                                    } catch (IllegalArgumentException e) {
                                        Object[] objArr = new Object[i20];
                                        objArr[0] = trim;
                                        throw A.november(method3, e, "Malformed content type: %s", objArr);
                                    }
                                } else {
                                    i14 = i20;
                                    if (allowUnsafeNonAsciiValues) {
                                        builder.addUnsafeNonAscii(substring, trim);
                                    } else {
                                        builder.add(substring, trim);
                                    }
                                }
                                i18 += i14;
                                i19 = i14;
                                i15 = i21;
                            }
                            i12 = i15;
                            aoVar.tango = builder.build();
                            i13 = 1;
                        } else {
                            throw A.november(method3, null, "@Headers annotation is empty.", new Object[0]);
                        }
                    } else {
                        i12 = i15;
                        if (annotation instanceof yg.l) {
                            if (!aoVar.quebec) {
                                i13 = 1;
                                aoVar.romeo = true;
                            } else {
                                throw A.november(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else {
                            i13 = 1;
                            if (!(annotation instanceof yg.e)) {
                                continue;
                            } else if (!aoVar.romeo) {
                                aoVar.quebec = true;
                            } else {
                                throw A.november(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                        }
                    }
                    i17 += i13;
                    z11 = i13;
                    i15 = i12;
                }
                i12 = i15;
                i13 = z11 ? 1 : 0;
                i17 += i13;
                z11 = i13;
                i15 = i12;
            } else {
                if (aoVar.oscar != null) {
                    if (!aoVar.papa) {
                        if (!aoVar.romeo) {
                            if (aoVar.quebec) {
                                throw A.november(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            }
                        } else {
                            throw A.november(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    Annotation[][] annotationArr3 = aoVar.echo;
                    int length3 = annotationArr3.length;
                    aoVar.whiskey = new A[length3];
                    int i22 = length3 - 1;
                    int i23 = 0;
                    loop2: while (i23 < length3) {
                        A[] aArr2 = aoVar.whiskey;
                        Type type = aoVar.foxtrot[i23];
                        Annotation[] annotationArr4 = annotationArr3[i23];
                        if (i23 == i22) {
                            i4 = 1;
                        } else {
                            i4 = i16;
                        }
                        if (annotationArr4 != null) {
                            int length4 = annotationArr4.length;
                            a6 = null;
                            while (true) {
                                annotationArr = annotationArr3;
                                if (i16 >= length4) {
                                    break;
                                }
                                Annotation annotation2 = annotationArr4[i16];
                                int i24 = length3;
                                int i25 = i16;
                                if (annotation2 instanceof yg.y) {
                                    aoVar.charlie(i23, type);
                                    if (!aoVar.november) {
                                        if (!aoVar.juliet) {
                                            if (!aoVar.kilo) {
                                                if (!aoVar.lima) {
                                                    if (!aoVar.mike) {
                                                        if (aoVar.sierra == null) {
                                                            aoVar.november = true;
                                                            if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                                                                a8 = new ad(method3, i23, 1);
                                                                i5 = i22;
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "@Url cannot be used with @%s URL", aoVar.oscar);
                                                        }
                                                    } else {
                                                        throw A.oscar(method3, i23, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                                    }
                                                } else {
                                                    throw A.oscar(method3, i23, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                                }
                                            } else {
                                                throw A.oscar(method3, i23, "A @Url parameter must not come after a @Query.", new Object[0]);
                                            }
                                        } else {
                                            throw A.oscar(method3, i23, "@Path parameters may not be used with @Url.", new Object[0]);
                                        }
                                    } else {
                                        throw A.oscar(method3, i23, "Multiple @Url method annotations found.", new Object[0]);
                                    }
                                } else {
                                    i5 = i22;
                                    boolean z12 = annotation2 instanceof yg.s;
                                    at atVar2 = aoVar.alpha;
                                    if (z12) {
                                        aoVar.charlie(i23, type);
                                        if (!aoVar.kilo) {
                                            if (!aoVar.lima) {
                                                if (!aoVar.mike) {
                                                    if (!aoVar.november) {
                                                        if (aoVar.sierra != null) {
                                                            aoVar.juliet = true;
                                                            yg.s sVar = (yg.s) annotation2;
                                                            String value2 = sVar.value();
                                                            if (ao.zulu.matcher(value2).matches()) {
                                                                if (aoVar.victor.contains(value2)) {
                                                                    atVar2.echo(type, annotationArr4);
                                                                    a8 = new af(method3, i23, value2, sVar.encoded());
                                                                } else {
                                                                    throw A.oscar(method3, i23, "URL \"%s\" does not contain \"{%s}\".", aoVar.sierra, value2);
                                                                }
                                                            } else {
                                                                throw A.oscar(method3, i23, "@Path parameter name must match %s. Found: %s", ao.yankee.pattern(), value2);
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "@Path can only be used with relative url on @%s", aoVar.oscar);
                                                        }
                                                    } else {
                                                        throw A.oscar(method3, i23, "@Path parameters may not be used with @Url.", new Object[0]);
                                                    }
                                                } else {
                                                    throw A.oscar(method3, i23, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                                }
                                            } else {
                                                throw A.oscar(method3, i23, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                            }
                                        } else {
                                            throw A.oscar(method3, i23, "A @Path parameter must not come after a @Query.", new Object[0]);
                                        }
                                    } else {
                                        aArr = aArr2;
                                        i10 = i4;
                                        if (annotation2 instanceof yg.t) {
                                            aoVar.charlie(i23, type);
                                            yg.t tVar = (yg.t) annotation2;
                                            String value3 = tVar.value();
                                            boolean encoded = tVar.encoded();
                                            i11 = length4;
                                            Class hotel = A.hotel(type);
                                            str = str2;
                                            aoVar.kilo = true;
                                            if (Iterable.class.isAssignableFrom(hotel)) {
                                                if (type instanceof ParameterizedType) {
                                                    atVar2.echo(A.golf(0, (ParameterizedType) type), annotationArr4);
                                                    zVar = new z(new ab(value3, 2, encoded), 0);
                                                    a8 = zVar;
                                                } else {
                                                    throw A.oscar(method3, i23, hotel.getSimpleName() + " must include generic type (e.g., " + hotel.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                            } else {
                                                if (hotel.isArray()) {
                                                    atVar2.echo(ao.alpha(hotel.getComponentType()), annotationArr4);
                                                    c3 = 2;
                                                    a8 = new z(new ab(value3, 2, encoded), 1);
                                                } else {
                                                    c3 = 2;
                                                    atVar2.echo(type, annotationArr4);
                                                    a8 = new ab(value3, 2, encoded);
                                                }
                                                if (a8 != null) {
                                                    if (a6 == null) {
                                                        a6 = a8;
                                                    } else {
                                                        throw A.oscar(method3, i23, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                                    }
                                                }
                                                i16 = i25 + 1;
                                                annotationArr3 = annotationArr;
                                                length3 = i24;
                                                i22 = i5;
                                                length4 = i11;
                                                aArr2 = aArr;
                                                i4 = i10;
                                                str2 = str;
                                            }
                                        } else {
                                            str = str2;
                                            i11 = length4;
                                            if (annotation2 instanceof yg.v) {
                                                aoVar.charlie(i23, type);
                                                boolean encoded2 = ((yg.v) annotation2).encoded();
                                                Class hotel2 = A.hotel(type);
                                                aoVar.lima = true;
                                                if (Iterable.class.isAssignableFrom(hotel2)) {
                                                    if (type instanceof ParameterizedType) {
                                                        atVar2.echo(A.golf(0, (ParameterizedType) type), annotationArr4);
                                                        zVar = new z(new ag(encoded2), 0);
                                                    } else {
                                                        throw A.oscar(method3, i23, hotel2.getSimpleName() + " must include generic type (e.g., " + hotel2.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                } else if (hotel2.isArray()) {
                                                    atVar2.echo(ao.alpha(hotel2.getComponentType()), annotationArr4);
                                                    zVar = new z(new ag(encoded2), 1);
                                                } else {
                                                    atVar2.echo(type, annotationArr4);
                                                    a8 = new ag(encoded2);
                                                }
                                                a8 = zVar;
                                            } else {
                                                if (annotation2 instanceof yg.u) {
                                                    aoVar.charlie(i23, type);
                                                    Class hotel3 = A.hotel(type);
                                                    aoVar.mike = true;
                                                    if (Map.class.isAssignableFrom(hotel3)) {
                                                        Type india = A.india(type, hotel3);
                                                        if (india instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType = (ParameterizedType) india;
                                                            Type golf = A.golf(0, parameterizedType);
                                                            if (String.class == golf) {
                                                                atVar2.echo(A.golf(1, parameterizedType), annotationArr4);
                                                                a8 = new ac(method3, i23, ((yg.u) annotation2).encoded(), 2);
                                                            } else {
                                                                throw A.oscar(method3, i23, "@QueryMap keys must be of type String: " + golf, new Object[0]);
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw A.oscar(method3, i23, "@QueryMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof yg.i) {
                                                    aoVar.charlie(i23, type);
                                                    yg.i iVar = (yg.i) annotation2;
                                                    String value4 = iVar.value();
                                                    Class hotel4 = A.hotel(type);
                                                    if (Iterable.class.isAssignableFrom(hotel4)) {
                                                        if (type instanceof ParameterizedType) {
                                                            atVar2.echo(A.golf(0, (ParameterizedType) type), annotationArr4);
                                                            a8 = new z(new ab(value4, 1, iVar.allowUnsafeNonAsciiValues()), 0);
                                                        } else {
                                                            throw A.oscar(method3, i23, hotel4.getSimpleName() + " must include generic type (e.g., " + hotel4.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                    } else if (hotel4.isArray()) {
                                                        atVar2.echo(ao.alpha(hotel4.getComponentType()), annotationArr4);
                                                        a8 = new z(new ab(value4, 1, iVar.allowUnsafeNonAsciiValues()), 1);
                                                    } else {
                                                        atVar2.echo(type, annotationArr4);
                                                        aeVar = new ab(value4, 1, iVar.allowUnsafeNonAsciiValues());
                                                        a8 = aeVar;
                                                    }
                                                } else if (annotation2 instanceof yg.j) {
                                                    if (type == Headers.class) {
                                                        a8 = new ad(method3, i23, 0);
                                                    } else {
                                                        aoVar.charlie(i23, type);
                                                        Class hotel5 = A.hotel(type);
                                                        if (Map.class.isAssignableFrom(hotel5)) {
                                                            Type india2 = A.india(type, hotel5);
                                                            if (india2 instanceof ParameterizedType) {
                                                                ParameterizedType parameterizedType2 = (ParameterizedType) india2;
                                                                Type golf2 = A.golf(0, parameterizedType2);
                                                                if (String.class == golf2) {
                                                                    atVar2.echo(A.golf(1, parameterizedType2), annotationArr4);
                                                                    a8 = new ac(method3, i23, ((yg.j) annotation2).allowUnsafeNonAsciiValues(), 1);
                                                                } else {
                                                                    throw A.oscar(method3, i23, "@HeaderMap keys must be of type String: " + golf2, new Object[0]);
                                                                }
                                                            } else {
                                                                throw A.oscar(method3, i23, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                        }
                                                    }
                                                } else if (annotation2 instanceof yg.c) {
                                                    aoVar.charlie(i23, type);
                                                    if (aoVar.quebec) {
                                                        yg.c cVar = (yg.c) annotation2;
                                                        String value5 = cVar.value();
                                                        boolean encoded3 = cVar.encoded();
                                                        aoVar.golf = true;
                                                        Class hotel6 = A.hotel(type);
                                                        if (Iterable.class.isAssignableFrom(hotel6)) {
                                                            if (type instanceof ParameterizedType) {
                                                                atVar2.echo(A.golf(0, (ParameterizedType) type), annotationArr4);
                                                                a8 = new z(new ab(value5, 0, encoded3), 0);
                                                            } else {
                                                                throw A.oscar(method3, i23, hotel6.getSimpleName() + " must include generic type (e.g., " + hotel6.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                        } else if (hotel6.isArray()) {
                                                            atVar2.echo(ao.alpha(hotel6.getComponentType()), annotationArr4);
                                                            a8 = new z(new ab(value5, 0, encoded3), 1);
                                                        } else {
                                                            atVar2.echo(type, annotationArr4);
                                                            aeVar = new ab(value5, 0, encoded3);
                                                            a8 = aeVar;
                                                        }
                                                    } else {
                                                        throw A.oscar(method3, i23, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof yg.d) {
                                                    aoVar.charlie(i23, type);
                                                    if (aoVar.quebec) {
                                                        Class hotel7 = A.hotel(type);
                                                        if (Map.class.isAssignableFrom(hotel7)) {
                                                            Type india3 = A.india(type, hotel7);
                                                            if (india3 instanceof ParameterizedType) {
                                                                ParameterizedType parameterizedType3 = (ParameterizedType) india3;
                                                                int i26 = 0;
                                                                Type golf3 = A.golf(0, parameterizedType3);
                                                                if (String.class == golf3) {
                                                                    atVar2.echo(A.golf(1, parameterizedType3), annotationArr4);
                                                                    aoVar.golf = true;
                                                                    a8 = new ac(method3, i23, ((yg.d) annotation2).encoded(), i26);
                                                                } else {
                                                                    throw A.oscar(method3, i23, "@FieldMap keys must be of type String: " + golf3, new Object[0]);
                                                                }
                                                            } else {
                                                                throw A.oscar(method3, i23, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                    } else {
                                                        throw A.oscar(method3, i23, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof yg.q) {
                                                    aoVar.charlie(i23, type);
                                                    if (aoVar.romeo) {
                                                        yg.q qVar = (yg.q) annotation2;
                                                        aoVar.hotel = true;
                                                        String value6 = qVar.value();
                                                        Class hotel8 = A.hotel(type);
                                                        if (value6.isEmpty()) {
                                                            boolean isAssignableFrom = Iterable.class.isAssignableFrom(hotel8);
                                                            ah ahVar = ah.delta;
                                                            if (isAssignableFrom) {
                                                                if (type instanceof ParameterizedType) {
                                                                    if (MultipartBody.Part.class.isAssignableFrom(A.hotel(A.golf(0, (ParameterizedType) type)))) {
                                                                        a8 = new z(ahVar, 0);
                                                                    } else {
                                                                        throw A.oscar(method3, i23, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw A.oscar(method3, i23, hotel8.getSimpleName() + " must include generic type (e.g., " + hotel8.getSimpleName() + "<String>)", new Object[0]);
                                                                }
                                                            } else if (hotel8.isArray()) {
                                                                if (MultipartBody.Part.class.isAssignableFrom(hotel8.getComponentType())) {
                                                                    a8 = new z(ahVar, 1);
                                                                } else {
                                                                    throw A.oscar(method3, i23, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                            } else if (MultipartBody.Part.class.isAssignableFrom(hotel8)) {
                                                                a8 = ahVar;
                                                            } else {
                                                                throw A.oscar(method3, i23, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                        } else {
                                                            Headers of2 = Headers.of("Content-Disposition", ao.ad.gray("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                            if (Iterable.class.isAssignableFrom(hotel8)) {
                                                                if (type instanceof ParameterizedType) {
                                                                    Type golf4 = A.golf(0, (ParameterizedType) type);
                                                                    if (!MultipartBody.Part.class.isAssignableFrom(A.hotel(golf4))) {
                                                                        a8 = new z(new ae(method3, i23, of2, atVar2.charlie(golf4, annotationArr4, annotationArr2)), 0);
                                                                    } else {
                                                                        throw A.oscar(method3, i23, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw A.oscar(method3, i23, hotel8.getSimpleName() + " must include generic type (e.g., " + hotel8.getSimpleName() + "<String>)", new Object[0]);
                                                                }
                                                            } else if (hotel8.isArray()) {
                                                                Class alpha = ao.alpha(hotel8.getComponentType());
                                                                if (!MultipartBody.Part.class.isAssignableFrom(alpha)) {
                                                                    a8 = new z(new ae(method3, i23, of2, atVar2.charlie(alpha, annotationArr4, annotationArr2)), 1);
                                                                } else {
                                                                    throw A.oscar(method3, i23, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                            } else if (!MultipartBody.Part.class.isAssignableFrom(hotel8)) {
                                                                aeVar = new ae(method3, i23, of2, atVar2.charlie(type, annotationArr4, annotationArr2));
                                                                a8 = aeVar;
                                                            } else {
                                                                throw A.oscar(method3, i23, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        throw A.oscar(method3, i23, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                } else {
                                                    if (annotation2 instanceof yg.r) {
                                                        aoVar.charlie(i23, type);
                                                        if (aoVar.romeo) {
                                                            aoVar.hotel = true;
                                                            Class hotel9 = A.hotel(type);
                                                            if (Map.class.isAssignableFrom(hotel9)) {
                                                                Type india4 = A.india(type, hotel9);
                                                                if (india4 instanceof ParameterizedType) {
                                                                    ParameterizedType parameterizedType4 = (ParameterizedType) india4;
                                                                    Type golf5 = A.golf(0, parameterizedType4);
                                                                    if (String.class == golf5) {
                                                                        Type golf6 = A.golf(1, parameterizedType4);
                                                                        if (!MultipartBody.Part.class.isAssignableFrom(A.hotel(golf6))) {
                                                                            aiVar = new ae(method3, i23, atVar2.charlie(golf6, annotationArr4, annotationArr2), ((yg.r) annotation2).encoding());
                                                                        } else {
                                                                            throw A.oscar(method3, i23, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw A.oscar(method3, i23, "@PartMap keys must be of type String: " + golf5, new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw A.oscar(method3, i23, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                                }
                                                            } else {
                                                                throw A.oscar(method3, i23, "@PartMap parameter type must be Map.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                    } else if (annotation2 instanceof yg.a) {
                                                        aoVar.charlie(i23, type);
                                                        if (aoVar.quebec || aoVar.romeo) {
                                                            break loop2;
                                                        }
                                                        if (!aoVar.india) {
                                                            try {
                                                                m charlie = atVar2.charlie(type, annotationArr4, annotationArr2);
                                                                aoVar.india = true;
                                                                aiVar = new aa(method3, i23, charlie);
                                                            } catch (RuntimeException e4) {
                                                                throw A.papa(method3, e4, i23, "Unable to create @Body converter for %s", type);
                                                            }
                                                        } else {
                                                            throw A.oscar(method3, i23, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                    } else if (annotation2 instanceof yg.x) {
                                                        aoVar.charlie(i23, type);
                                                        Class alpha2 = ao.alpha(A.hotel(type));
                                                        for (int i27 = i23 - 1; i27 >= 0; i27--) {
                                                            A a10 = aoVar.whiskey[i27];
                                                            if ((a10 instanceof ai) && ((ai) a10).delta.equals(alpha2)) {
                                                                throw A.oscar(method3, i23, "@Tag type " + alpha2.getName() + " is duplicate of " + aj.bravo.delta(method3, i27) + " and would always overwrite its value.", new Object[0]);
                                                            }
                                                        }
                                                        aiVar = new ai(alpha2);
                                                    } else {
                                                        a8 = null;
                                                    }
                                                    a8 = aiVar;
                                                }
                                                if (a8 != null) {
                                                }
                                                i16 = i25 + 1;
                                                annotationArr3 = annotationArr;
                                                length3 = i24;
                                                i22 = i5;
                                                length4 = i11;
                                                aArr2 = aArr;
                                                i4 = i10;
                                                str2 = str;
                                            }
                                        }
                                        if (a8 != null) {
                                        }
                                        i16 = i25 + 1;
                                        annotationArr3 = annotationArr;
                                        length3 = i24;
                                        i22 = i5;
                                        length4 = i11;
                                        aArr2 = aArr;
                                        i4 = i10;
                                        str2 = str;
                                    }
                                }
                                aArr = aArr2;
                                str = str2;
                                i10 = i4;
                                i11 = length4;
                                if (a8 != null) {
                                }
                                i16 = i25 + 1;
                                annotationArr3 = annotationArr;
                                length3 = i24;
                                i22 = i5;
                                length4 = i11;
                                aArr2 = aArr;
                                i4 = i10;
                                str2 = str;
                            }
                            throw A.oscar(method3, i23, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                        }
                        a6 = null;
                        annotationArr = annotationArr3;
                        int i28 = length3;
                        int i29 = i22;
                        A[] aArr3 = aArr2;
                        String str4 = str2;
                        int i30 = i4;
                        if (a6 == null) {
                            if (i30 != 0) {
                                try {
                                    if (A.hotel(type) == Nd.c.class) {
                                        aoVar.xray = true;
                                        a6 = null;
                                    }
                                } catch (NoClassDefFoundError unused) {
                                }
                            }
                            throw A.oscar(method3, i23, "No Retrofit annotation found.", new Object[0]);
                        }
                        aArr3[i23] = a6;
                        i23++;
                        annotationArr3 = annotationArr;
                        length3 = i28;
                        i22 = i29;
                        str2 = str4;
                        i16 = 0;
                    }
                    String str5 = str2;
                    if (aoVar.sierra == null && !aoVar.november) {
                        throw A.november(method3, null, "Missing either @%s URL or @Url parameter.", aoVar.oscar);
                    }
                    boolean z13 = aoVar.quebec;
                    if (!z13 && !aoVar.romeo && !aoVar.papa && aoVar.india) {
                        throw A.november(method3, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                    if (z13 && !aoVar.golf) {
                        throw A.november(method3, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    if (aoVar.romeo && !aoVar.hotel) {
                        throw A.november(method3, null, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    ap apVar = new ap(aoVar);
                    Type genericReturnType2 = method.getGenericReturnType();
                    if (!A.juliet(genericReturnType2)) {
                        if (genericReturnType2 != Void.TYPE) {
                            Annotation[] annotations = method.getAnnotations();
                            boolean z14 = apVar.lima;
                            if (z14) {
                                Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[r4.length - 1]).getActualTypeArguments()[0];
                                if (type2 instanceof WildcardType) {
                                    type2 = ((WildcardType) type2).getLowerBounds()[0];
                                }
                                if (A.hotel(type2) == aq.class && (type2 instanceof ParameterizedType)) {
                                    type2 = A.golf(0, (ParameterizedType) type2);
                                    mike = false;
                                    z2 = true;
                                } else if (A.hotel(type2) != d.class) {
                                    mike = A.mike(type2);
                                    z2 = false;
                                } else {
                                    throw A.november(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", A.golf(0, (ParameterizedType) type2));
                                }
                                genericReturnType = new ay(null, d.class, type2);
                                if (!A.lima(annotations, av.class)) {
                                    Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                                    annotationArr5[0] = aw.alpha;
                                    System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                                    annotations = annotationArr5;
                                }
                                method2 = method;
                                z10 = mike;
                            } else {
                                method2 = method;
                                genericReturnType = method2.getGenericReturnType();
                                z2 = false;
                                z10 = false;
                            }
                            try {
                                f alpha3 = atVar.alpha(genericReturnType, annotations);
                                Type responseType = alpha3.responseType();
                                if (responseType != Response.class) {
                                    if (responseType != aq.class) {
                                        if (apVar.delta.equals(str5) && !Void.class.equals(responseType) && !A.mike(responseType)) {
                                            throw A.november(method2, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                                        }
                                        try {
                                            m delta = atVar.delta(responseType, method2.getAnnotations());
                                            Call.Factory factory = atVar.bravo;
                                            if (!z14) {
                                                return new p(apVar, factory, delta, alpha3);
                                            }
                                            if (z2) {
                                                return new r(apVar, factory, delta, alpha3);
                                            }
                                            return new q(apVar, factory, delta, alpha3, z10);
                                        } catch (RuntimeException e5) {
                                            throw A.november(method2, e5, "Unable to create converter for %s", responseType);
                                        }
                                    }
                                    throw A.november(method2, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                }
                                throw A.november(method2, null, "'" + A.hotel(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                            } catch (RuntimeException e10) {
                                throw A.november(method2, e10, "Unable to create call adapter for %s", genericReturnType);
                            }
                        }
                        throw A.november(method, null, "Service methods cannot return void.", new Object[0]);
                    }
                    throw A.november(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                throw A.november(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }
}
