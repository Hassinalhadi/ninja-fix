package zendesk.core;

import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ZendeskUserProvider implements UserProvider {
    private final UserService userService;
    private static final RetrofitZendeskCallbackAdapter.RequestExtractor<UserResponse, User> USER_EXTRACTOR = new RetrofitZendeskCallbackAdapter.RequestExtractor<UserResponse, User>() { // from class: zendesk.core.ZendeskUserProvider.6
        @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
        public User extract(UserResponse userResponse) {
            return userResponse.getUser();
        }
    };
    private static final RetrofitZendeskCallbackAdapter.RequestExtractor<UserFieldResponse, List<UserField>> FIELDS_EXTRACTOR = new RetrofitZendeskCallbackAdapter.RequestExtractor<UserFieldResponse, List<UserField>>() { // from class: zendesk.core.ZendeskUserProvider.7
        @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
        public List<UserField> extract(UserFieldResponse userFieldResponse) {
            return userFieldResponse.getUserFields();
        }
    };
    private static final RetrofitZendeskCallbackAdapter.RequestExtractor<UserResponse, Map<String, String>> FIELDS_MAP_EXTRACTOR = new RetrofitZendeskCallbackAdapter.RequestExtractor<UserResponse, Map<String, String>>() { // from class: zendesk.core.ZendeskUserProvider.8
        @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
        public Map<String, String> extract(UserResponse userResponse) {
            if (userResponse != null && userResponse.getUser() != null) {
                return userResponse.getUser().getUserFields();
            }
            return CollectionUtils.copyOf(new HashMap());
        }
    };
    private static final RetrofitZendeskCallbackAdapter.RequestExtractor<UserResponse, List<String>> TAGS_EXTRACTOR = new RetrofitZendeskCallbackAdapter.RequestExtractor<UserResponse, List<String>>() { // from class: zendesk.core.ZendeskUserProvider.9
        @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
        public List<String> extract(UserResponse userResponse) {
            if (userResponse != null && userResponse.getUser() != null) {
                return userResponse.getUser().getTags();
            }
            return CollectionUtils.copyOf(new ArrayList());
        }
    };

    public ZendeskUserProvider(UserService userService) {
        this.userService = userService;
    }

    @Override // zendesk.core.UserProvider
    public void addTags(List<String> list, final ZendeskCallback<List<String>> zendeskCallback) {
        this.userService.addTags(new UserTagRequest(CollectionUtils.ensureEmpty(list))).o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<List<String>>(zendeskCallback) { // from class: zendesk.core.ZendeskUserProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(List<String> list2) {
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void deleteTags(List<String> list, final ZendeskCallback<List<String>> zendeskCallback) {
        this.userService.deleteTags(StringUtils.toCsvString((List<String>) CollectionUtils.ensureEmpty(list))).o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<List<String>>(zendeskCallback) { // from class: zendesk.core.ZendeskUserProvider.2
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(List<String> list2) {
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(list2);
                }
            }
        }, TAGS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUser(final ZendeskCallback<User> zendeskCallback) {
        this.userService.getUser().o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<User>(zendeskCallback) { // from class: zendesk.core.ZendeskUserProvider.5
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(User user) {
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(user);
                }
            }
        }, USER_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void getUserFields(final ZendeskCallback<List<UserField>> zendeskCallback) {
        this.userService.getUserFields().o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<List<UserField>>(zendeskCallback) { // from class: zendesk.core.ZendeskUserProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(List<UserField> list) {
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(list);
                }
            }
        }, FIELDS_EXTRACTOR));
    }

    @Override // zendesk.core.UserProvider
    public void setUserFields(Map<String, String> map, final ZendeskCallback<Map<String, String>> zendeskCallback) {
        this.userService.setUserFields(new UserFieldRequest(map)).o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<Map<String, String>>(zendeskCallback) { // from class: zendesk.core.ZendeskUserProvider.4
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(Map<String, String> map2) {
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(map2);
                }
            }
        }, FIELDS_MAP_EXTRACTOR));
    }
}
