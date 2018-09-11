package com.http;

/**
 * @author WilliamAhmed
 * @since 11/09/2018
 */
public enum HttpResponseCode {

	RESPONSE_100(100,"Continue"),
	RESPONSE_101(101,"Switching Protocols"),
	RESPONSE_102(102,"Processing"),
	RESPONSE_103(103,"Early Hints"),

	RESPONSE_200(200,"OK"),
	RESPONSE_201(201,"Created"),
	RESPONSE_202(202,"Accepted"),
	RESPONSE_203(203,"Non-Authoritative Information"),
	RESPONSE_204(204,"No Content"),
	RESPONSE_205(205,"Reset Content"),
	RESPONSE_206(206,"Partial Content"),
	RESPONSE_207(207,"Multi-Status"),
	RESPONSE_208(208,"Already Reported"),
	RESPONSE_226(226,"IM Used"),

	RESPONSE_300(300,"Multiple Choices"),
	RESPONSE_301(301,"Moved Permanently"),
	RESPONSE_302(302,"Found (Previously 'Moved Temporarily')"),
	RESPONSE_303(303,"See Other"),
	RESPONSE_304(304,"Not Modified"),
	RESPONSE_305(305,"Use Proxy"),
	RESPONSE_306(306,"Switch Proxy"),
	RESPONSE_307(307,"Temporary Redirect"),
	RESPONSE_308(308,"Permanent Redirect"),

	RESPONSE_400(400,"Bad Request"),
	RESPONSE_401(401,"Unauthorized"),
	RESPONSE_402(402,"Payment Required"),
	RESPONSE_403(403,"Forbidden"),
	RESPONSE_404(404,"Not Found"),
	RESPONSE_405(405,"Method Not Allowed"),
	RESPONSE_406(406,"Not Acceptable"),
	RESPONSE_407(407,"Proxy Authentication Required"),
	RESPONSE_408(408,"Request Timeout"),
	RESPONSE_409(409,"Conflict"),
	RESPONSE_410(410,"Gone"),
	RESPONSE_411(411,"Length Required"),
	RESPONSE_412(412,"Precondition Failed"),
	RESPONSE_413(413,"Payload Too Large"),
	RESPONSE_414(414,"URI Too Long"),
	RESPONSE_415(415,"Unsupported Media Type"),
	RESPONSE_416(416,"Range Not Satisfiable"),
	RESPONSE_417(417,"Expectation Failed"),
	RESPONSE_418(418,"I'm a teapot"),
	RESPONSE_421(421,"Misdirected Request"),
	RESPONSE_422(422,"Unprocessable Entity"),
	RESPONSE_423(423,"Locked"),
	RESPONSE_424(424,"Failed Dependency"),
	RESPONSE_426(426,"Upgrade Required"),
	RESPONSE_428(428,"Precondition Required"),
	RESPONSE_429(429,"Too Many Requests"),
	RESPONSE_431(431,"Request Header Fields Too Large"),
	RESPONSE_451(451,"Unavailable For Legal Reasons"),

	RESPONSE_500(500,"Internal Server Error"),
	RESPONSE_501(501,"Not Implemented"),
	RESPONSE_502(502,"Bad Gateway"),
	RESPONSE_503(503,"Service Unavailable"),
	RESPONSE_504(504,"Gateway Timeout"),
	RESPONSE_505(505,"HTTP Version Not Supported"),
	RESPONSE_506(506,"Variant Also Negotiates"),
	RESPONSE_507(507,"Inufficient Storage"),
	RESPONSE_508(508,"Loop Detected"),
	RESPONSE_510(510,"Not Extended"),
	RESPONSE_511(511,"Network Authentication Required");


	private final int code;
	private final String codeDescription;

	HttpResponseCode(int code, String codeDescription) {
		this.code = code;
		this.codeDescription  = codeDescription;
	}

	public String getCodeDescription() {
		return codeDescription;
	}

	public int getCode() {
		return code;
	}

	public static HttpResponseCode getHttpResponseCodeForIntegerCode(int code) {
		for (HttpResponseCode httpResponseCode: HttpResponseCode.values()) {
			if(httpResponseCode.getCode() == code) {
				return httpResponseCode;
			}
		}
		return null;
	}



}
