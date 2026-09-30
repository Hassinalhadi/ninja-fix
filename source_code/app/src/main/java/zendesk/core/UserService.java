package zendesk.core;

import vg.d;
import yg.a;
import yg.b;
import yg.f;
import yg.o;
import yg.p;
import yg.t;

/* loaded from: classes.dex */
interface UserService {
    @o("/api/mobile/user_tags.json")
    d<UserResponse> addTags(@a UserTagRequest userTagRequest);

    @b("/api/mobile/user_tags/destroy_many.json")
    d<UserResponse> deleteTags(@t("tags") String str);

    @f("/api/mobile/users/me.json")
    d<UserResponse> getUser();

    @f("/api/mobile/user_fields.json")
    d<UserFieldResponse> getUserFields();

    @p("/api/mobile/users/me.json")
    d<UserResponse> setUserFields(@a UserFieldRequest userFieldRequest);
}
