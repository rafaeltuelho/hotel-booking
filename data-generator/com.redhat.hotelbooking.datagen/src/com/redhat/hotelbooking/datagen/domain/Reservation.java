/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package com.redhat.hotelbooking.datagen.domain;

import java.sql.Timestamp;

public final class Reservation {

    private final Timestamp checkin;
    private final Timestamp checkout;
    private final int customerId;
    private final double dailyRate;
    private final int id;
    private final int roomId;

    public Reservation( final int id,
                        final int roomId,
                        final int customerId,
                        final Timestamp checkin,
                        final Timestamp checkout,
                        final double dailyRate ) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.customerId = customerId;
        this.dailyRate = dailyRate;
        this.id = id;
        this.roomId = roomId;
    }

    public Timestamp getCheckin() {
        return this.checkin;
    }

    public Timestamp getCheckout() {
        return this.checkout;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }

    public int getId() {
        return this.id;
    }

    public int getRoomId() {
        return this.roomId;
    }

}