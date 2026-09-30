package W1;

import J2.e;
import J8.ay;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class b {
    public static final Object foxtrot = new Object();
    public static b golf;
    public final Context alpha;
    public final HashMap bravo = new HashMap();
    public final HashMap charlie = new HashMap();
    public final ArrayList delta = new ArrayList();
    public final ay echo;

    public b(Context context) {
        this.alpha = context;
        this.echo = new ay(this, context.getMainLooper());
    }

    public static b alpha(Context context) {
        b bVar;
        synchronized (foxtrot) {
            try {
                if (golf == null) {
                    golf = new b(context.getApplicationContext());
                }
                bVar = golf;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final void bravo(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.bravo) {
            try {
                a aVar = new a(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.bravo.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.bravo.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList arrayList2 = (ArrayList) this.charlie.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.charlie.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean charlie(Intent intent) {
        boolean z2;
        ArrayList arrayList;
        String str;
        synchronized (this.bravo) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.alpha.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.charlie.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i4 = 0;
                    while (i4 < arrayList2.size()) {
                        a aVar = (a) arrayList2.get(i4);
                        if (z2) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + aVar.alpha);
                        }
                        if (aVar.charlie) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int match = aVar.alpha.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(aVar);
                                aVar.charlie = true;
                            } else {
                                arrayList = arrayList2;
                                if (z2) {
                                    if (match != -4) {
                                        if (match != -3) {
                                            if (match != -2) {
                                                if (match != -1) {
                                                    str = "unknown reason";
                                                } else {
                                                    str = Constants.KEY_TYPE;
                                                }
                                            } else {
                                                str = Column.DATA;
                                            }
                                        } else {
                                            str = Constants.KEY_ACTION;
                                        }
                                    } else {
                                        str = "category";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i4++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                            ((a) arrayList3.get(i5)).charlie = false;
                        }
                        this.delta.add(new e(18, intent, arrayList3));
                        if (!this.echo.hasMessages(1)) {
                            this.echo.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta(BroadcastReceiver broadcastReceiver) {
        synchronized (this.bravo) {
            try {
                ArrayList arrayList = (ArrayList) this.bravo.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a aVar = (a) arrayList.get(size);
                    aVar.delta = true;
                    for (int i4 = 0; i4 < aVar.alpha.countActions(); i4++) {
                        String action = aVar.alpha.getAction(i4);
                        ArrayList arrayList2 = (ArrayList) this.charlie.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                a aVar2 = (a) arrayList2.get(size2);
                                if (aVar2.bravo == broadcastReceiver) {
                                    aVar2.delta = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.charlie.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
