/*
 * Copyright (c) 2011-2020, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.core.incrementer;

import com.baomidou.mybatisplus.core.toolkit.Sequence;

/**
 * 默认 主键 生成器
 *
 * @author sd-wangtaicheng@sdcncsi.com.cn
 * @date 2019/10/15
 */
public class DefaultIdGenerator implements IdGenerator {

    private Sequence sequence;

    public DefaultIdGenerator() {
        sequence = new Sequence();
    }

    public DefaultIdGenerator(long workerId, long dataCenterId) {
        sequence = new Sequence(workerId, dataCenterId);
    }

    @Override
    public long nextId() {
        return sequence.nextId();
    }
}
