package zendesk.support.request;

import com.zendesk.util.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zendesk.support.Attachment;
import zendesk.support.User;

/* loaded from: classes.dex */
class StateRequestUser implements Serializable {
    private final String avatar;

    /* renamed from: id, reason: collision with root package name */
    private final long f14289id;
    private final boolean isAgent;
    private final String name;

    public StateRequestUser(String str, String str2, boolean z2, long j5) {
        this.name = str;
        this.avatar = str2;
        this.isAgent = z2;
        this.f14289id = j5;
    }

    public static boolean containsAgent(List<StateRequestUser> list) {
        Iterator<StateRequestUser> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isAgent()) {
                return true;
            }
        }
        return false;
    }

    public static List<StateRequestUser> convert(List<User> list) {
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        for (User user : list) {
            if (user.getId() != null) {
                Attachment photo = user.getPhoto();
                if (photo != null && StringUtils.hasLength(photo.getContentUrl())) {
                    str = photo.getContentUrl();
                } else {
                    str = "";
                }
                arrayList.add(new StateRequestUser(user.getName(), str, user.isAgent(), user.getId().longValue()));
            }
        }
        return arrayList;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f14289id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAgent() {
        return this.isAgent;
    }
}
