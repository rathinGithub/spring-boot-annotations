package com.techwithratz.initialzr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("asdasdada")
public class BabySitterProvider implements BabyDayCare {

}
