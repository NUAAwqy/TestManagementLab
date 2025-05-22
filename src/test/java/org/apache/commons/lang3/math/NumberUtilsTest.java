package org.apache.commons.lang3.math;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("NumberUtils 单元测试")
class NumberUtilsTest {
    @Test
    @DisplayName("测试 toInt() 方法")
    void testToInt() {
        assertEquals(123, NumberUtils.toInt("123", 0), "正常数字转换失败");
        assertEquals(0, NumberUtils.toInt("abc", 0), "非数字字符串处理失败");
        assertEquals(-1, NumberUtils.toInt(null, -1), "null 输入处理失败");
    }
    @Test
    @DisplayName("测试 isDigits() 方法")
    void testIsDigits() {
        assertTrue(NumberUtils.isDigits("123"), "纯数字字符串识别失败");
        assertFalse(NumberUtils.isDigits("12a"), "非数字字符识别失败");
        assertFalse(NumberUtils.isDigits(null), "null 输入应返回 false");
    }
    @Test
    @DisplayName("测试 max() 方法")
    void testMax() {
        assertEquals(3, NumberUtils.max(new int[]{1, 3, 2}), "最大值计算错误");
        assertThrows(IllegalArgumentException.class,
                () -> NumberUtils.max(new int[]{}),
                "空数组未抛出异常");
        assertThrows(IllegalArgumentException.class,
                () -> NumberUtils.max((int[]) null),
                "null 数组未抛出异常");
    }
}