package com.softtron.pinmaoserver.utils;

import com.softtron.pinmaoorder.exceptions.NotFileException;

public class ExceptionUtil {
    public static final Exception NOTFILEEXCEPTION = new NotFileException("上传文件为空", "50001");
}
