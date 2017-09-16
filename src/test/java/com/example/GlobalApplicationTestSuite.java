package com.example;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

// 모든 Test 로 끝나는 파일을 실행합니다.
@RunWith(WildcardPatternSuite.class)
@SuiteClasses({ "**/*Test.class" })
public class GlobalApplicationTestSuite {
}
