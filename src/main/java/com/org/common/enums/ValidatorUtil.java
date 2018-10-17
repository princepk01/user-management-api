package com.org.common.enums;

public final class ValidatorUtil {
	@SuppressWarnings("unused")
	private static final String validateNameRegEx = "[[\\p{IsAlphabetic}]+[\\p{Space}]*]+";

	/*
	 * public static void validateMobile(String mobile) {
	 * BizAssert.isTrue(mobile != null ? mobile.matches("[\\d]{10,12}+") :
	 * false, PartnerResultCode.CONTACT_NUMBER_INVALID); }
	 * 
	 * public static void validateEmail(String email, int j) {
	 * 
	 * BizAssert.isTrue( email != null && !email.isEmpty() && email.length() <=
	 * j && email.matches(
	 * "(([\\w\\.-]*[a-zA-Z0-9_]){4,}@([\\w\\.-]*[a-zA-Z0-9]){3,}\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z])*"
	 * ), PartnerResultCode.EMAIL_INVALID);
	 * 
	 * }
	 * 
	 * public static void validateUsingRegex(String value, String regex,
	 * PartnerResultCode resultCode) { BizAssert.isTrue(value != null ?
	 * value.matches(regex) : false, resultCode); }
	 * 
	 * public static void validateName(String name, int i, int j) {
	 * BizAssert.isTrue(name != null && !name.isEmpty() && name.length() >= i &&
	 * name.length() <= j && name.matches(validateNameRegEx),
	 * PartnerResultCode.USER_NAME_INVALID); }
	 * 
	 * public static void validateNames(String name, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(name != null &&
	 * !name.isEmpty() && name.length() >= i && name.length() <= j &&
	 * name.matches(validateNameRegEx), partnerResultCode); }
	 * 
	 * public static void validateAddress(String address) {
	 * BizAssert.isTrue(address != null && !address.isEmpty() ?
	 * (address.length() <= 512) : true, PartnerResultCode.ADDRESS_INVALID); }
	 * 
	 * public static void validateLengthCity(String value, int i, int j,
	 * PartnerResultCode code) { BizAssert.isTrue(value != null &&
	 * !value.isEmpty() && value.length() >= i && value.length() <= j, code); }
	 * 
	 * public static void validateLengthState(String state) {
	 * BizAssert.isTrue(state != null && !state.isEmpty() ? (state.length() <=
	 * 64) : true, PartnerResultCode.STATE_INVALID); }
	 * 
	 * public static void validateLengthCountry(String country) {
	 * BizAssert.isTrue(country != null && !country.isEmpty() ?
	 * (country.length() <= 64) : true, PartnerResultCode.COUNTRY_INVALID); }
	 * 
	 * public static void validateLength(String value, int i, int j, ResultCode
	 * code) { BizAssert.isTrue(value != null && !value.isEmpty() ?
	 * (value.length() >= i && value.length() <= j) : false, code); }
	 * 
	 * public static void validatePincode(String value, int i, int j) {
	 * BizAssert.isTrue(value != null && !value.isEmpty() && value.length() >= i
	 * && value.length() <= j && value.matches("[\\d]{3,64}+"),
	 * PartnerResultCode.PINCODE_INVALID); }
	 * 
	 * public static void validateIdentifier(String value, int i, int j) {
	 * BizAssert.isTrue(value != null && !value.isEmpty() && value.length() >= i
	 * && value.length() <= j && value.matches("^[A-Za-z0-9]*"),
	 * PartnerResultCode.IDENTIFIER_INVALID); }
	 * 
	 * public static void validateShare(String value, PartnerResultCode
	 * resultCode, int i, int j) { BizAssert.isTrue(value != null &&
	 * !value.isEmpty() && value.length() >= i && value.length() <= j &&
	 * value.matches("[\\d]{1,2}+"), resultCode); }
	 * 
	 * public static void validateMaximumShare(String value, PartnerResultCode
	 * resultCode, int i, int j) { BizAssert.isTrue(value != null &&
	 * !value.isEmpty() && value.length() >= i && value.length() <= j &&
	 * value.matches("[\\d]{1,2}+"), resultCode); }
	 * 
	 * public static void validateShare(String share, PartnerResultCode
	 * shareInvalid) { try { Double.parseDouble(share); } catch (Exception e) {
	 * BizAssert.assertError(shareInvalid); } }
	 * 
	 * public static void validatePaymentType(String name, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(name != null &&
	 * !name.isEmpty() && name.length() >= i && name.length() <= j &&
	 * name.matches(validateNameRegEx), partnerResultCode); }
	 * 
	 * public static void validatePancard(String name, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(name != null &&
	 * !name.isEmpty() && name.length() >= i && name.length() <= j &&
	 * name.matches("^[A-Za-z0-9]*"), partnerResultCode); }
	 * 
	 * public static void validateAccountNumber(String name, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(name != null &&
	 * !name.isEmpty() && name.length() >= i && name.length() <= j &&
	 * name.matches("[\\d]{3,128}+"), partnerResultCode); }
	 * 
	 * public static void validateBankAddress(String address, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(address != null
	 * && !address.isEmpty() && address.length() >= i && address.length() <= j,
	 * partnerResultCode); }
	 * 
	 * public static void validateBankBranch(String address, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(address != null
	 * && !address.isEmpty() && address.length() >= i && address.length() <= j,
	 * partnerResultCode); }
	 * 
	 * public static void validateBankCity(String city, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(city != null &&
	 * !city.isEmpty() && city.length() >= i && city.length() <= j,
	 * partnerResultCode); }
	 * 
	 * public static void validateBankIfscCode(String ifscCode, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue(ifscCode != null
	 * && !ifscCode.isEmpty() && ifscCode.length() >= i && ifscCode.length() <=
	 * j && ifscCode.matches("^[A-Za-z0-9]*"), partnerResultCode); }
	 * 
	 * public static void validateServiceTaxNumber(String serviceTaxNumber, int
	 * i, int j, PartnerResultCode partnerResultCode) { BizAssert.isTrue(
	 * serviceTaxNumber != null && !serviceTaxNumber.isEmpty() &&
	 * serviceTaxNumber.length() >= i && serviceTaxNumber.length() <= j &&
	 * serviceTaxNumber.matches("^[A-Za-z0-9]*"), partnerResultCode); }
	 * 
	 * public static void validateGST(String gst, int i, int j,
	 * PartnerResultCode partnerResultCode) { BizAssert.isTrue( gst != null &&
	 * !gst.isEmpty() && gst.length() >= i && gst.length() <= j &&
	 * gst.matches("^[A-Za-z0-9]*"), partnerResultCode); }
	 * 
	 * public static void validateDate(Date date, PartnerResultCode
	 * partnerResultCode, String param) { BizAssert.isTrue(date != null,
	 * partnerResultCode, param); }
	 */
}
