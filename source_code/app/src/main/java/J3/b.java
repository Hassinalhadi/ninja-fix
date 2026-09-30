package J3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements r {
    public final /* synthetic */ int alpha;
    public final Object bravo;
    public final Object charlie;

    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.charlie = obj;
        this.bravo = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [J3.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, J3.a] */
    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        Resources resources;
        q alpha;
        Uri uri;
        switch (this.alpha) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new q(new X3.d(uri2), this.bravo.hotel((AssetManager) this.charlie, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) iVar.charlie(N3.c.bravo);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) this.charlie).getResources();
                }
                return new q(new X3.d(num), new e(theme, resources, this.bravo, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.charlie;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                E3.f fVar = null;
                for (int i10 = 0; i10 < size; i10++) {
                    r rVar = (r) arrayList.get(i10);
                    if (rVar.bravo(obj) && (alpha = rVar.alpha(obj, i4, i5, iVar)) != null) {
                        arrayList2.add(alpha.charlie);
                        fVar = alpha.alpha;
                    }
                }
                if (arrayList2.isEmpty() || fVar == null) {
                    return null;
                }
                return new q(fVar, new v(arrayList2, (J2.t) this.bravo));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) this.bravo;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + '/' + resources2.getResourceTypeName(num2.intValue()) + '/' + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((r) this.charlie).alpha(uri, i4, i5, iVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                r rVar2 = (r) this.bravo;
                q qVar = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt == 0) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                            }
                        } else {
                            qVar = rVar2.alpha(Integer.valueOf(parseInt), i4, i5, iVar);
                        }
                        return qVar;
                    } catch (NumberFormatException e4) {
                        if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e4);
                            return qVar;
                        }
                        return qVar;
                    }
                }
                if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri3.getPathSegments();
                    String str = pathSegments2.get(0);
                    String str2 = pathSegments2.get(1);
                    Context context = (Context) this.charlie;
                    int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                    if (identifier == 0) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                        return null;
                    }
                    return rVar2.alpha(Integer.valueOf(identifier), i4, i5, iVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                return null;
        }
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                Uri uri = (Uri) obj;
                if (!CTVariableUtils.FILE.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                    return false;
                }
                return true;
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.charlie).iterator();
                while (it.hasNext()) {
                    if (((r) it.next()).bravo(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) this.charlie).getPackageName().equals(uri2.getAuthority())) {
                    return true;
                }
                return false;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.charlie).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public b(Resources resources, r rVar) {
        this.alpha = 3;
        this.bravo = resources;
        this.charlie = rVar;
    }

    public b(Context context, f fVar) {
        this.alpha = 1;
        this.charlie = context.getApplicationContext();
        this.bravo = fVar;
    }

    public b(Context context, r rVar) {
        this.alpha = 4;
        this.charlie = context.getApplicationContext();
        this.bravo = rVar;
    }
}
