package zendesk.support;

import zendesk.core.RestServiceProvider;

/* loaded from: classes.dex */
class ServiceModule {
    public static ZendeskRequestService provideZendeskRequestService(RequestService requestService) {
        return new ZendeskRequestService(requestService);
    }

    public static ZendeskUploadService provideZendeskUploadService(UploadService uploadService) {
        return new ZendeskUploadService(uploadService);
    }

    public static RequestService providesRequestService(RestServiceProvider restServiceProvider) {
        return (RequestService) restServiceProvider.createRestService(RequestService.class, com.zendesk.sdk.providers.BuildConfig.VERSION_NAME, Constants.USER_AGENT_VARIANT);
    }

    public static UploadService providesUploadService(RestServiceProvider restServiceProvider) {
        return (UploadService) restServiceProvider.createRestService(UploadService.class, com.zendesk.sdk.providers.BuildConfig.VERSION_NAME, Constants.USER_AGENT_VARIANT);
    }
}
