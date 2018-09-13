package com.http.response;

/**
 * The enum Http response code.
 *
 * @author WilliamAhmed
 * @since 11 /09/2018
 */
public enum HttpResponseCode {

	/**
	 * Response 100 http response code.
	 */
	RESPONSE_100(100,"Continue"),
	/**
	 * The Response 101.
	 */
	RESPONSE_101(101,"Switching Protocols"),
	/**
	 * Response 102 http response code.
	 */
	RESPONSE_102(102,"Processing"),
	/**
	 * The Response 103.
	 */
	RESPONSE_103(103,"Early Hints"),

	/**
	 * Response 200 http response code.
	 */
	RESPONSE_200(200,"OK"),
	/**
	 * Response 201 http response code.
	 */
	RESPONSE_201(201,"Created"),
	/**
	 * Response 202 http response code.
	 */
	RESPONSE_202(202,"Accepted"),
	/**
	 * The Response 203.
	 */
	RESPONSE_203(203,"Non-Authoritative Information"),
	/**
	 * The Response 204.
	 */
	RESPONSE_204(204,"No Content"),
	/**
	 * The Response 205.
	 */
	RESPONSE_205(205,"Reset Content"),
	/**
	 * The Response 206.
	 */
	RESPONSE_206(206,"Partial Content"),
	/**
	 * Response 207 http response code.
	 */
	RESPONSE_207(207,"Multi-Status"),
	/**
	 * The Response 208.
	 */
	RESPONSE_208(208,"Already Reported"),
	/**
	 * The Response 226.
	 */
	RESPONSE_226(226,"IM Used"),

	/**
	 * The Response 300.
	 */
	RESPONSE_300(300,"Multiple Choices"),
	/**
	 * The Response 301.
	 */
	RESPONSE_301(301,"Moved Permanently"),
	/**
	 * The Response 302.
	 */
	RESPONSE_302(302,"Found (Previously 'Moved Temporarily')"),
	/**
	 * The Response 303.
	 */
	RESPONSE_303(303,"See Other"),
	/**
	 * The Response 304.
	 */
	RESPONSE_304(304,"Not Modified"),
	/**
	 * The Response 305.
	 */
	RESPONSE_305(305,"Use Proxy"),
	/**
	 * The Response 306.
	 */
	RESPONSE_306(306,"Switch Proxy"),
	/**
	 * The Response 307.
	 */
	RESPONSE_307(307,"Temporary Redirect"),
	/**
	 * The Response 308.
	 */
	RESPONSE_308(308,"Permanent Redirect"),

	/**
	 * The Response 400.
	 */
	RESPONSE_400(400,"Bad Request"),
	/**
	 * Response 401 http response code.
	 */
	RESPONSE_401(401,"Unauthorized"),
	/**
	 * The Response 402.
	 */
	RESPONSE_402(402,"Payment Required"),
	/**
	 * Response 403 http response code.
	 */
	RESPONSE_403(403,"Forbidden"),
	/**
	 * The Response 404.
	 */
	RESPONSE_404(404,"Not Found"),
	/**
	 * The Response 405.
	 */
	RESPONSE_405(405,"Method Not Allowed"),
	/**
	 * The Response 406.
	 */
	RESPONSE_406(406,"Not Acceptable"),
	/**
	 * The Response 407.
	 */
	RESPONSE_407(407,"Proxy Authentication Required"),
	/**
	 * The Response 408.
	 */
	RESPONSE_408(408,"Request Timeout"),
	/**
	 * Response 409 http response code.
	 */
	RESPONSE_409(409,"Conflict"),
	/**
	 * Response 410 http response code.
	 */
	RESPONSE_410(410,"Gone"),
	/**
	 * The Response 411.
	 */
	RESPONSE_411(411,"Length Required"),
	/**
	 * The Response 412.
	 */
	RESPONSE_412(412,"Precondition Failed"),
	/**
	 * The Response 413.
	 */
	RESPONSE_413(413,"Payload Too Large"),
	/**
	 * The Response 414.
	 */
	RESPONSE_414(414,"URI Too Long"),
	/**
	 * The Response 415.
	 */
	RESPONSE_415(415,"Unsupported Media Type"),
	/**
	 * The Response 416.
	 */
	RESPONSE_416(416,"Range Not Satisfiable"),
	/**
	 * The Response 417.
	 */
	RESPONSE_417(417,"Expectation Failed"),
	/**
	 * The Response 418.
	 */
	RESPONSE_418(418,"I'm a teapot"),
	/**
	 * The Response 421.
	 */
	RESPONSE_421(421,"Misdirected Request"),
	/**
	 * The Response 422.
	 */
	RESPONSE_422(422,"Unprocessable Entity"),
	/**
	 * Response 423 http response code.
	 */
	RESPONSE_423(423,"Locked"),
	/**
	 * The Response 424.
	 */
	RESPONSE_424(424,"Failed Dependency"),
	/**
	 * The Response 426.
	 */
	RESPONSE_426(426,"Upgrade Required"),
	/**
	 * The Response 428.
	 */
	RESPONSE_428(428,"Precondition Required"),
	/**
	 * The Response 429.
	 */
	RESPONSE_429(429,"Too Many Requests"),
	/**
	 * The Response 431.
	 */
	RESPONSE_431(431,"Request Header Fields Too Large"),
	/**
	 * The Response 451.
	 */
	RESPONSE_451(451,"Unavailable For Legal Reasons"),

	/**
	 * The Response 500.
	 */
	RESPONSE_500(500,"Internal Server Error"),
	/**
	 * The Response 501.
	 */
	RESPONSE_501(501,"Not Implemented"),
	/**
	 * The Response 502.
	 */
	RESPONSE_502(502,"Bad Gateway"),
	/**
	 * The Response 503.
	 */
	RESPONSE_503(503,"Service Unavailable"),
	/**
	 * The Response 504.
	 */
	RESPONSE_504(504,"Gateway Timeout"),
	/**
	 * The Response 505.
	 */
	RESPONSE_505(505,"HTTP Version Not Supported"),
	/**
	 * The Response 506.
	 */
	RESPONSE_506(506,"Variant Also Negotiates"),
	/**
	 * The Response 507.
	 */
	RESPONSE_507(507,"Inufficient Storage"),
	/**
	 * The Response 508.
	 */
	RESPONSE_508(508,"Loop Detected"),
	/**
	 * The Response 510.
	 */
	RESPONSE_510(510,"Not Extended"),
	/**
	 * The Response 511.
	 */
	RESPONSE_511(511,"Network Authentication Required");


	private final int code;
	private final String codeDescription;

	HttpResponseCode(int code, String codeDescription) {
		this.code = code;
		this.codeDescription  = codeDescription;
	}

	/**
	 * Gets code description.
	 *
	 * @return the code description
	 */
	public String getCodeDescription() {
		return codeDescription;
	}

	/**
	 * Gets code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Gets http response code for integer code.
	 *
	 * @param code the code
	 * @return the http response code for integer code
	 */
	public static HttpResponseCode getHttpResponseCodeForIntegerCode(int code) {
		for (HttpResponseCode httpResponseCode: HttpResponseCode.values()) {
			if(httpResponseCode.getCode() == code) {
				return httpResponseCode;
			}
		}
		return null;
	}



}
