//package com.stackroute.service.oauth2.user;
//
//import com.stackroute.domain.AuthProvider;
//import com.stackroute.exception.OAuth2AuthenticationProcessingException;
//
//import java.util.Map;
//
//public class OAuth2UserInfoFactory {
//    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) throws OAuth2AuthenticationProcessingException {
//        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
//            return new GoogleOAuth2UserInfo(attributes);
//        } else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
//            return new FacebookOAuth2UserInfo(attributes);
//        } else {
//            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
//        }
//    }
//}
